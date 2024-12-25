package org.pcap4j.packet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11BssMembershipSelector;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11AbstractSupportedRatesElement.class */
public abstract class Dot11AbstractSupportedRatesElement extends Dot11InformationElement {
    private static final long serialVersionUID = -1751480012950433980L;
    private final List<BssMembershipSelector> bssMembershipSelectors;
    private final List<Rate> rates;
    private final List<Datum> ratesAndBssMembershipSelectors;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11AbstractSupportedRatesElement$BssMembershipSelector.class */
    public static final class BssMembershipSelector implements Datum {
        private static final long serialVersionUID = 5749787247631286263L;
        private final boolean basic;
        private final Dot11BssMembershipSelector selector;

        public BssMembershipSelector(boolean z10, Dot11BssMembershipSelector dot11BssMembershipSelector) {
            if (dot11BssMembershipSelector == null) {
                throw new NullPointerException("selector is null.");
            }
            this.basic = z10;
            this.selector = dot11BssMembershipSelector;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || BssMembershipSelector.class != obj.getClass()) {
                return false;
            }
            BssMembershipSelector bssMembershipSelector = (BssMembershipSelector) obj;
            return this.basic == bssMembershipSelector.basic && this.selector.equals(bssMembershipSelector.selector);
        }

        @Override // org.pcap4j.packet.Dot11AbstractSupportedRatesElement.Datum
        public byte getRawData() {
            int byteValue = this.selector.value().byteValue();
            int i10 = byteValue;
            if (this.basic) {
                i10 = (byteValue | 128) == true ? 1 : 0;
            }
            return (byte) i10;
        }

        public Dot11BssMembershipSelector getSelector() {
            return this.selector;
        }

        public int hashCode() {
            return (((this.basic ? 1231 : 1237) + 31) * 31) + this.selector.hashCode();
        }

        public boolean isBasic() {
            return this.basic;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("BSS Membership Selector: ");
            sb2.append(this.selector);
            sb2.append(this.basic ? " (basic)" : " (non-basic)");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11AbstractSupportedRatesElement$Builder.class */
    public static abstract class Builder extends Dot11InformationElement.Builder {
        private List<Datum> ratesAndBssMembershipSelectors;

        public Builder() {
        }

        public Builder(Dot11AbstractSupportedRatesElement dot11AbstractSupportedRatesElement) {
            super(dot11AbstractSupportedRatesElement);
            this.ratesAndBssMembershipSelectors = dot11AbstractSupportedRatesElement.ratesAndBssMembershipSelectors;
        }

        public void preBuild() {
            if (this.ratesAndBssMembershipSelectors == null) {
                throw new NullPointerException("ratesAndBssMembershipSelectors is null.");
            }
            if (getCorrectLengthAtBuild()) {
                length((byte) this.ratesAndBssMembershipSelectors.size());
            }
        }

        public Builder ratesAndBssMembershipSelectors(List<Datum> list) {
            this.ratesAndBssMembershipSelectors = list;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11AbstractSupportedRatesElement$Datum.class */
    public interface Datum extends Serializable {
        byte getRawData();
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11AbstractSupportedRatesElement$Rate.class */
    public static final class Rate implements Datum {
        private static final long serialVersionUID = -3227287901080960330L;
        private final boolean basic;
        private final byte rate;

        public Rate(boolean z10, byte b10) {
            if (b10 >= 0) {
                this.basic = z10;
                this.rate = b10;
            } else {
                throw new IllegalArgumentException("The rate must be between 0 to 127 but is actually: " + ((int) b10));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Rate.class != obj.getClass()) {
                return false;
            }
            Rate rate = (Rate) obj;
            return this.basic == rate.basic && this.rate == rate.rate;
        }

        public byte getRate() {
            return this.rate;
        }

        public double getRateInMbitPerSec() {
            return this.rate * 0.5d;
        }

        @Override // org.pcap4j.packet.Dot11AbstractSupportedRatesElement.Datum
        public byte getRawData() {
            return this.basic ? (this.rate | 128) == true ? 1 : 0 : this.rate;
        }

        public int hashCode() {
            return (((this.basic ? 1231 : 1237) + 31) * 31) + this.rate;
        }

        public boolean isBasic() {
            return this.basic;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Supported Rate: ");
            sb2.append(getRateInMbitPerSec());
            sb2.append(" Mbit/sec");
            sb2.append(this.basic ? " (basic)" : " (non-basic)");
            return sb2.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [org.pcap4j.packet.Dot11AbstractSupportedRatesElement$BssMembershipSelector] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v41, types: [org.pcap4j.packet.Dot11AbstractSupportedRatesElement$Rate] */
    public Dot11AbstractSupportedRatesElement(Builder builder) {
        super(builder);
        List list;
        BssMembershipSelector bssMembershipSelector;
        if (builder.ratesAndBssMembershipSelectors.size() > 255) {
            throw new IllegalArgumentException("Too long ratesAndBssMembershipSelectors: " + builder.ratesAndBssMembershipSelectors);
        }
        this.rates = new ArrayList();
        this.bssMembershipSelectors = new ArrayList();
        for (Datum datum : builder.ratesAndBssMembershipSelectors) {
            if (datum instanceof Rate) {
                list = this.rates;
                bssMembershipSelector = (Rate) datum;
            } else {
                if (!(datum instanceof BssMembershipSelector)) {
                    throw new IllegalArgumentException("An illegal object in builder.ratesAndBssMembershipSelectors: " + datum);
                }
                list = this.bssMembershipSelectors;
                bssMembershipSelector = (BssMembershipSelector) datum;
            }
            list.add(bssMembershipSelector);
        }
        this.ratesAndBssMembershipSelectors = new ArrayList(builder.ratesAndBssMembershipSelectors);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [org.pcap4j.packet.Dot11AbstractSupportedRatesElement$BssMembershipSelector] */
    public Dot11AbstractSupportedRatesElement(byte[] bArr, int i10, int i11, Dot11InformationElementId dot11InformationElementId) {
        super(bArr, i10, i11, dot11InformationElementId);
        Rate rate;
        List list;
        this.rates = new ArrayList();
        this.bssMembershipSelectors = new ArrayList();
        this.ratesAndBssMembershipSelectors = new ArrayList();
        int lengthAsInt = getLengthAsInt();
        for (int i12 = 0; i12 < lengthAsInt; i12++) {
            byte b10 = bArr[i10 + 2 + i12];
            boolean z10 = (b10 & 128) != 0;
            byte b11 = (byte) (b10 & Byte.MAX_VALUE);
            if (Dot11BssMembershipSelector.isRegistered(Byte.valueOf(b11))) {
                rate = new BssMembershipSelector(z10, Dot11BssMembershipSelector.getInstance(Byte.valueOf(b11)));
                list = this.bssMembershipSelectors;
            } else {
                rate = new Rate(z10, b11);
                list = this.rates;
            }
            list.add(rate);
            this.ratesAndBssMembershipSelectors.add(rate);
        }
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        return super.equals(obj) && this.ratesAndBssMembershipSelectors.equals(((Dot11AbstractSupportedRatesElement) obj).ratesAndBssMembershipSelectors);
    }

    public List<BssMembershipSelector> getBssMembershipSelectors() {
        return new ArrayList(this.bssMembershipSelectors);
    }

    public abstract Builder getBuilder();

    public abstract String getElementName();

    public List<Rate> getRates() {
        return new ArrayList(this.rates);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        Iterator<Datum> it = this.ratesAndBssMembershipSelectors.iterator();
        int i10 = 2;
        while (it.hasNext()) {
            bArr[i10] = it.next().getRawData();
            i10++;
        }
        return bArr;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return (super.hashCode() * 31) + this.ratesAndBssMembershipSelectors.hashCode();
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return this.ratesAndBssMembershipSelectors.size() + 2;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append(getElementName());
        sb2.append(":");
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
        for (Datum datum : this.ratesAndBssMembershipSelectors) {
            sb2.append(str);
            sb2.append("  ");
            sb2.append(datum);
            sb2.append(property);
        }
        return sb2.toString();
    }
}

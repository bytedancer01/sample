package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.IllegalRadiotapData;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.RadiotapDataAMpduStatus;
import org.pcap4j.packet.RadiotapDataAntenna;
import org.pcap4j.packet.RadiotapDataAntennaNoise;
import org.pcap4j.packet.RadiotapDataAntennaSignal;
import org.pcap4j.packet.RadiotapDataChannel;
import org.pcap4j.packet.RadiotapDataDbAntennaNoise;
import org.pcap4j.packet.RadiotapDataDbAntennaSignal;
import org.pcap4j.packet.RadiotapDataDbTxAttenuation;
import org.pcap4j.packet.RadiotapDataDbmTxPower;
import org.pcap4j.packet.RadiotapDataFhss;
import org.pcap4j.packet.RadiotapDataFlags;
import org.pcap4j.packet.RadiotapDataLockQuality;
import org.pcap4j.packet.RadiotapDataMcs;
import org.pcap4j.packet.RadiotapDataRate;
import org.pcap4j.packet.RadiotapDataRxFlags;
import org.pcap4j.packet.RadiotapDataTsft;
import org.pcap4j.packet.RadiotapDataTxAttenuation;
import org.pcap4j.packet.RadiotapDataVht;
import org.pcap4j.packet.RadiotapPacket;
import org.pcap4j.packet.UnknownRadiotapData;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.RadiotapPresentBitNumber;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticRadiotapDataFieldFactory.class */
public final class StaticRadiotapDataFieldFactory implements PacketFactory<RadiotapPacket.RadiotapData, RadiotapPresentBitNumber> {
    private static final StaticRadiotapDataFieldFactory INSTANCE = new StaticRadiotapDataFieldFactory();
    private final Map<RadiotapPresentBitNumber, Instantiater> instantiaters;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticRadiotapDataFieldFactory$Instantiater.class */
    public interface Instantiater {
        Class<? extends RadiotapPacket.RadiotapData> getTargetClass();

        RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11);
    }

    private StaticRadiotapDataFieldFactory() {
        HashMap hashMap = new HashMap();
        this.instantiaters = hashMap;
        hashMap.put(RadiotapPresentBitNumber.TSFT, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.1
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataTsft> getTargetClass() {
                return RadiotapDataTsft.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataTsft.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.FLAGS, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.2
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataFlags> getTargetClass() {
                return RadiotapDataFlags.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataFlags.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.RATE, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.3
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataRate> getTargetClass() {
                return RadiotapDataRate.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataRate.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.CHANNEL, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.4
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataChannel> getTargetClass() {
                return RadiotapDataChannel.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataChannel.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.FHSS, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.5
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataFhss> getTargetClass() {
                return RadiotapDataFhss.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataFhss.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.ANTENNA_SIGNAL, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.6
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataAntennaSignal> getTargetClass() {
                return RadiotapDataAntennaSignal.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataAntennaSignal.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.ANTENNA_NOISE, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.7
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataAntennaNoise> getTargetClass() {
                return RadiotapDataAntennaNoise.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataAntennaNoise.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.LOCK_QUALITY, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.8
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataLockQuality> getTargetClass() {
                return RadiotapDataLockQuality.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataLockQuality.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.TX_ATTENUATION, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.9
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataTxAttenuation> getTargetClass() {
                return RadiotapDataTxAttenuation.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataTxAttenuation.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.DB_TX_ATTENUATION, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.10
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataDbTxAttenuation> getTargetClass() {
                return RadiotapDataDbTxAttenuation.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataDbTxAttenuation.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.DBM_TX_POWER, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.11
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataDbmTxPower> getTargetClass() {
                return RadiotapDataDbmTxPower.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataDbmTxPower.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.ANTENNA, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.12
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataAntenna> getTargetClass() {
                return RadiotapDataAntenna.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataAntenna.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.DB_ANTENNA_SIGNAL, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.13
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataDbAntennaSignal> getTargetClass() {
                return RadiotapDataDbAntennaSignal.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataDbAntennaSignal.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.DB_ANTENNA_NOISE, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.14
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataDbAntennaNoise> getTargetClass() {
                return RadiotapDataDbAntennaNoise.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataDbAntennaNoise.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.RX_FLAGS, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.15
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataRxFlags> getTargetClass() {
                return RadiotapDataRxFlags.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataRxFlags.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.MCS, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.16
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataMcs> getTargetClass() {
                return RadiotapDataMcs.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataMcs.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.A_MPDU_STATUS, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.17
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataAMpduStatus> getTargetClass() {
                return RadiotapDataAMpduStatus.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataAMpduStatus.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(RadiotapPresentBitNumber.VHT, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.18
            public final StaticRadiotapDataFieldFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public Class<RadiotapDataVht> getTargetClass() {
                return RadiotapDataVht.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticRadiotapDataFieldFactory.Instantiater
            public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
                return RadiotapDataVht.newInstance(bArr, i10, i11);
            }
        });
    }

    public static StaticRadiotapDataFieldFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends RadiotapPacket.RadiotapData> getTargetClass() {
        return UnknownRadiotapData.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends RadiotapPacket.RadiotapData> getTargetClass(RadiotapPresentBitNumber radiotapPresentBitNumber) {
        if (radiotapPresentBitNumber == null) {
            throw new NullPointerException("number must not be null.");
        }
        Instantiater instantiater = this.instantiaters.get(radiotapPresentBitNumber);
        return instantiater != null ? instantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11) {
        return UnknownRadiotapData.newInstance(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public RadiotapPacket.RadiotapData newInstance(byte[] bArr, int i10, int i11, RadiotapPresentBitNumber radiotapPresentBitNumber) {
        if (bArr != null && radiotapPresentBitNumber != null) {
            try {
                Instantiater instantiater = this.instantiaters.get(radiotapPresentBitNumber);
                return instantiater != null ? instantiater.newInstance(bArr, i10, i11) : newInstance(bArr, i10, i11);
            } catch (IllegalRawDataException e10) {
                return IllegalRadiotapData.newInstance(bArr, i10, i11);
            }
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("rawData: ");
        sb2.append(bArr);
        sb2.append(" number: ");
        sb2.append(radiotapPresentBitNumber);
        throw new NullPointerException(sb2.toString());
    }
}

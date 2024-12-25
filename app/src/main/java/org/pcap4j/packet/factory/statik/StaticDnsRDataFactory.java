package org.pcap4j.packet.factory.statik;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.DnsRDataA;
import org.pcap4j.packet.DnsRDataAaaa;
import org.pcap4j.packet.DnsRDataCName;
import org.pcap4j.packet.DnsRDataCaa;
import org.pcap4j.packet.DnsRDataHInfo;
import org.pcap4j.packet.DnsRDataMInfo;
import org.pcap4j.packet.DnsRDataMb;
import org.pcap4j.packet.DnsRDataMd;
import org.pcap4j.packet.DnsRDataMf;
import org.pcap4j.packet.DnsRDataMg;
import org.pcap4j.packet.DnsRDataMr;
import org.pcap4j.packet.DnsRDataMx;
import org.pcap4j.packet.DnsRDataNs;
import org.pcap4j.packet.DnsRDataNull;
import org.pcap4j.packet.DnsRDataPtr;
import org.pcap4j.packet.DnsRDataSoa;
import org.pcap4j.packet.DnsRDataTxt;
import org.pcap4j.packet.DnsRDataWks;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.packet.IllegalDnsRData;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.UnknownDnsRData;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.DnsResourceRecordType;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticDnsRDataFactory.class */
public final class StaticDnsRDataFactory implements PacketFactory<DnsResourceRecord.DnsRData, DnsResourceRecordType> {
    private static final StaticDnsRDataFactory INSTANCE = new StaticDnsRDataFactory();
    private final Map<DnsResourceRecordType, Instantiater> instantiaters;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/factory/statik/StaticDnsRDataFactory$Instantiater.class */
    public interface Instantiater {
        Class<? extends DnsResourceRecord.DnsRData> getTargetClass();

        DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11);
    }

    private StaticDnsRDataFactory() {
        HashMap hashMap = new HashMap();
        this.instantiaters = hashMap;
        hashMap.put(DnsResourceRecordType.f36265A, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.1
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataA> getTargetClass() {
                return DnsRDataA.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataA.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.f36276NS, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.2
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataNs> getTargetClass() {
                return DnsRDataNs.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataNs.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.f36271MD, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.3
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataMd> getTargetClass() {
                return DnsRDataMd.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataMd.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.f36272MF, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.4
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataMf> getTargetClass() {
                return DnsRDataMf.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataMf.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.CNAME, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.5
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataCName> getTargetClass() {
                return DnsRDataCName.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataCName.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.SOA, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.6
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataSoa> getTargetClass() {
                return DnsRDataSoa.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataSoa.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.f36270MB, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.7
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataMb> getTargetClass() {
                return DnsRDataMb.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataMb.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.f36273MG, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.8
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataMg> getTargetClass() {
                return DnsRDataMg.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataMg.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.f36274MR, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.9
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataMr> getTargetClass() {
                return DnsRDataMr.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataMr.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.NULL, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.10
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataNull> getTargetClass() {
                return DnsRDataNull.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataNull.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.WKS, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.11
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataWks> getTargetClass() {
                return DnsRDataWks.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataWks.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.PTR, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.12
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataPtr> getTargetClass() {
                return DnsRDataPtr.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataPtr.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.HINFO, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.13
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataHInfo> getTargetClass() {
                return DnsRDataHInfo.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataHInfo.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.MINFO, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.14
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataMInfo> getTargetClass() {
                return DnsRDataMInfo.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataMInfo.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.f36275MX, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.15
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataMx> getTargetClass() {
                return DnsRDataMx.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataMx.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.TXT, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.16
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataTxt> getTargetClass() {
                return DnsRDataTxt.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataTxt.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.AAAA, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.17
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataAaaa> getTargetClass() {
                return DnsRDataAaaa.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataAaaa.newInstance(bArr, i10, i11);
            }
        });
        hashMap.put(DnsResourceRecordType.CAA, new Instantiater(this) { // from class: org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.18
            public final StaticDnsRDataFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public Class<DnsRDataCaa> getTargetClass() {
                return DnsRDataCaa.class;
            }

            @Override // org.pcap4j.packet.factory.statik.StaticDnsRDataFactory.Instantiater
            public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
                return DnsRDataCaa.newInstance(bArr, i10, i11);
            }
        });
    }

    public static StaticDnsRDataFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends DnsResourceRecord.DnsRData> getTargetClass() {
        return UnknownDnsRData.class;
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public Class<? extends DnsResourceRecord.DnsRData> getTargetClass(DnsResourceRecordType dnsResourceRecordType) {
        if (dnsResourceRecordType == null) {
            throw new NullPointerException("number must not be null.");
        }
        Instantiater instantiater = this.instantiaters.get(dnsResourceRecordType);
        return instantiater != null ? instantiater.getTargetClass() : getTargetClass();
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11) {
        return UnknownDnsRData.newInstance(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.factory.PacketFactory
    public DnsResourceRecord.DnsRData newInstance(byte[] bArr, int i10, int i11, DnsResourceRecordType dnsResourceRecordType) {
        if (bArr != null && dnsResourceRecordType != null) {
            try {
                Instantiater instantiater = this.instantiaters.get(dnsResourceRecordType);
                return instantiater != null ? instantiater.newInstance(bArr, i10, i11) : newInstance(bArr, i10, i11);
            } catch (IllegalRawDataException e10) {
                return IllegalDnsRData.newInstance(bArr, i10, i11);
            }
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("rawData: ");
        sb2.append(bArr);
        sb2.append(" number: ");
        sb2.append(dnsResourceRecordType);
        throw new NullPointerException(sb2.toString());
    }
}

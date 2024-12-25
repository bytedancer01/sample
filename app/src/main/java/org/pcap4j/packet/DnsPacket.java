package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.DnsOpCode;
import org.pcap4j.packet.namednumber.DnsRCode;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsPacket.class */
public final class DnsPacket extends AbstractPacket {
    private static final long serialVersionUID = 2804715680374557063L;
    private final DnsHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private List<DnsResourceRecord> additionalInfo;
        private short anCount;
        private List<DnsResourceRecord> answers;
        private short arCount;
        private boolean authenticData;
        private boolean authoritativeAnswer;
        private List<DnsResourceRecord> authorities;
        private boolean checkingDisabled;

        /* renamed from: id */
        private short f36240id;
        private short nsCount;
        private DnsOpCode opCode;
        private short qdCount;
        private List<DnsQuestion> questions;
        private DnsRCode rCode;
        private boolean recursionAvailable;
        private boolean recursionDesired;
        private boolean reserved;
        private boolean response;
        private boolean truncated;

        public Builder() {
        }

        private Builder(DnsPacket dnsPacket) {
            this.f36240id = dnsPacket.header.f36241id;
            this.response = dnsPacket.header.response;
            this.opCode = dnsPacket.header.opCode;
            this.authoritativeAnswer = dnsPacket.header.authoritativeAnswer;
            this.truncated = dnsPacket.header.truncated;
            this.recursionDesired = dnsPacket.header.recursionDesired;
            this.recursionAvailable = dnsPacket.header.recursionAvailable;
            this.reserved = dnsPacket.header.reserved;
            this.authenticData = dnsPacket.header.authenticData;
            this.checkingDisabled = dnsPacket.header.checkingDisabled;
            this.rCode = dnsPacket.header.rCode;
            this.qdCount = dnsPacket.header.qdCount;
            this.anCount = dnsPacket.header.anCount;
            this.nsCount = dnsPacket.header.nsCount;
            this.arCount = dnsPacket.header.arCount;
            this.questions = dnsPacket.header.questions;
            this.answers = dnsPacket.header.answers;
            this.authorities = dnsPacket.header.authorities;
            this.additionalInfo = dnsPacket.header.additionalInfo;
        }

        public Builder additionalInfo(List<DnsResourceRecord> list) {
            this.additionalInfo = list;
            return this;
        }

        public Builder anCount(short s10) {
            this.anCount = s10;
            return this;
        }

        public Builder answers(List<DnsResourceRecord> list) {
            this.answers = list;
            return this;
        }

        public Builder arCount(short s10) {
            this.arCount = s10;
            return this;
        }

        public Builder authenticData(boolean z10) {
            this.authenticData = z10;
            return this;
        }

        public Builder authoritativeAnswer(boolean z10) {
            this.authoritativeAnswer = z10;
            return this;
        }

        public Builder authorities(List<DnsResourceRecord> list) {
            this.authorities = list;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public DnsPacket build() {
            return new DnsPacket(this);
        }

        public Builder checkingDisabled(boolean z10) {
            this.checkingDisabled = z10;
            return this;
        }

        /* renamed from: id */
        public Builder m32158id(short s10) {
            this.f36240id = s10;
            return this;
        }

        public Builder nsCount(short s10) {
            this.nsCount = s10;
            return this;
        }

        public Builder opCode(DnsOpCode dnsOpCode) {
            this.opCode = dnsOpCode;
            return this;
        }

        public Builder qdCount(short s10) {
            this.qdCount = s10;
            return this;
        }

        public Builder questions(List<DnsQuestion> list) {
            this.questions = list;
            return this;
        }

        public Builder rCode(DnsRCode dnsRCode) {
            this.rCode = dnsRCode;
            return this;
        }

        public Builder recursionAvailable(boolean z10) {
            this.recursionAvailable = z10;
            return this;
        }

        public Builder recursionDesired(boolean z10) {
            this.recursionDesired = z10;
            return this;
        }

        public Builder reserved(boolean z10) {
            this.reserved = z10;
            return this;
        }

        public Builder response(boolean z10) {
            this.response = z10;
            return this;
        }

        public Builder truncated(boolean z10) {
            this.truncated = z10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsPacket$DnsHeader.class */
    public static final class DnsHeader extends AbstractPacket.AbstractHeader {
        private static final int ANCOUNT_OFFSET = 6;
        private static final int ANCOUNT_SIZE = 2;
        private static final int ARCOUNT_OFFSET = 10;
        private static final int ARCOUNT_SIZE = 2;
        private static final int DNS_MIN_HEADER_SIZE = 12;
        private static final int FLAGS_OFFSET = 2;
        private static final int FLAGS_SIZE = 2;
        private static final int ID_OFFSET = 0;
        private static final int ID_SIZE = 2;
        private static final int NSCOUNT_OFFSET = 8;
        private static final int NSCOUNT_SIZE = 2;
        private static final int QDCOUNT_OFFSET = 4;
        private static final int QDCOUNT_SIZE = 2;
        private static final long serialVersionUID = -2779530760536525672L;
        private final List<DnsResourceRecord> additionalInfo;
        private final short anCount;
        private final List<DnsResourceRecord> answers;
        private final short arCount;
        private final boolean authenticData;
        private final boolean authoritativeAnswer;
        private final List<DnsResourceRecord> authorities;
        private final boolean checkingDisabled;

        /* renamed from: id */
        private final short f36241id;
        private final short nsCount;
        private final DnsOpCode opCode;
        private final short qdCount;
        private final List<DnsQuestion> questions;
        private final DnsRCode rCode;
        private final boolean recursionAvailable;
        private final boolean recursionDesired;
        private final boolean reserved;
        private final boolean response;
        private final boolean truncated;

        private DnsHeader(Builder builder) {
            List<DnsQuestion> emptyList;
            List<DnsResourceRecord> emptyList2;
            List<DnsResourceRecord> emptyList3;
            this.f36241id = builder.f36240id;
            this.response = builder.response;
            this.opCode = builder.opCode;
            this.authoritativeAnswer = builder.authoritativeAnswer;
            this.truncated = builder.truncated;
            this.recursionDesired = builder.recursionDesired;
            this.recursionAvailable = builder.recursionAvailable;
            this.reserved = builder.reserved;
            this.authenticData = builder.authenticData;
            this.checkingDisabled = builder.checkingDisabled;
            this.rCode = builder.rCode;
            this.qdCount = builder.qdCount;
            this.anCount = builder.anCount;
            this.nsCount = builder.nsCount;
            this.arCount = builder.arCount;
            if (builder.questions == null) {
                emptyList = Collections.emptyList();
            } else {
                if (builder.questions.size() > 65535) {
                    throw new IllegalArgumentException("The number of questions must be less than 65536. builder.questions.size(): " + builder.questions.size());
                }
                emptyList = new ArrayList(builder.questions);
            }
            this.questions = emptyList;
            if (builder.answers == null) {
                emptyList2 = Collections.emptyList();
            } else {
                if (builder.answers.size() > 65535) {
                    throw new IllegalArgumentException("The number of answers must be less than 65536. builder.answers.size(): " + builder.answers.size());
                }
                emptyList2 = new ArrayList(builder.answers);
            }
            this.answers = emptyList2;
            if (builder.authorities == null) {
                emptyList3 = Collections.emptyList();
            } else {
                if (builder.authorities.size() > 65535) {
                    throw new IllegalArgumentException("The number of authorities must be less than 65536. builder.authorities.size(): " + builder.authorities.size());
                }
                emptyList3 = new ArrayList(builder.authorities);
            }
            this.authorities = emptyList3;
            if (builder.additionalInfo == null) {
                this.additionalInfo = Collections.emptyList();
            } else {
                if (builder.additionalInfo.size() <= 65535) {
                    this.additionalInfo = new ArrayList(builder.additionalInfo);
                    return;
                }
                throw new IllegalArgumentException("The number of additionalInfo elements must be less than 65536. builder.additionalInfo.size(): " + builder.additionalInfo.size());
            }
        }

        private DnsHeader(byte[] bArr, int i10, int i11) {
            int i12 = 12;
            if (i11 < 12) {
                StringBuilder sb2 = new StringBuilder(200);
                sb2.append("The data is too short to build a DnsHeader (");
                sb2.append(12);
                sb2.append(" bytes). data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            this.f36241id = ByteArrays.getShort(bArr, i10 + 0);
            short s10 = ByteArrays.getShort(bArr, i10 + 2);
            this.response = (32768 & s10) != 0;
            this.opCode = DnsOpCode.getInstance(Byte.valueOf((byte) ((s10 >> 11) & 15)));
            this.authoritativeAnswer = (s10 & 1024) != 0;
            this.truncated = (s10 & 512) != 0;
            this.recursionDesired = (s10 & 256) != 0;
            this.recursionAvailable = (s10 & 128) != 0;
            this.reserved = (s10 & 64) != 0;
            this.authenticData = (s10 & 32) != 0;
            this.checkingDisabled = (s10 & 16) != 0;
            this.rCode = DnsRCode.getInstance(Byte.valueOf((byte) (s10 & 15)));
            this.qdCount = ByteArrays.getShort(bArr, i10 + 4);
            this.anCount = ByteArrays.getShort(bArr, i10 + 6);
            this.nsCount = ByteArrays.getShort(bArr, i10 + 8);
            this.arCount = ByteArrays.getShort(bArr, i10 + 10);
            int qdCountAsInt = getQdCountAsInt();
            int anCountAsInt = getAnCountAsInt();
            int nsCountAsInt = getNsCountAsInt();
            int arCountAsInt = getArCountAsInt();
            this.questions = new ArrayList(qdCountAsInt);
            this.answers = new ArrayList(anCountAsInt);
            this.authorities = new ArrayList(nsCountAsInt);
            this.additionalInfo = new ArrayList(arCountAsInt);
            for (int i13 = 0; i13 < qdCountAsInt; i13++) {
                int i14 = i11 - i12;
                if (i14 == 0) {
                    StringBuilder sb3 = new StringBuilder(200);
                    sb3.append("The data is too short to build a question in DnsHeader. data: ");
                    sb3.append(ByteArrays.toHexString(bArr, " "));
                    sb3.append(", offset: ");
                    sb3.append(i10);
                    sb3.append(", length: ");
                    sb3.append(i11);
                    sb3.append(", cursor: ");
                    sb3.append(i12);
                    throw new IllegalRawDataException(sb3.toString());
                }
                DnsQuestion newInstance = DnsQuestion.newInstance(bArr, i10 + i12, i14);
                this.questions.add(newInstance);
                i12 += newInstance.length();
            }
            for (int i15 = 0; i15 < anCountAsInt; i15++) {
                int i16 = i11 - i12;
                if (i16 == 0) {
                    StringBuilder sb4 = new StringBuilder(200);
                    sb4.append("The data is too short to build an answer in DnsHeader. data: ");
                    sb4.append(ByteArrays.toHexString(bArr, " "));
                    sb4.append(", offset: ");
                    sb4.append(i10);
                    sb4.append(", length: ");
                    sb4.append(i11);
                    sb4.append(", cursor: ");
                    sb4.append(i12);
                    throw new IllegalRawDataException(sb4.toString());
                }
                DnsResourceRecord newInstance2 = DnsResourceRecord.newInstance(bArr, i10 + i12, i16);
                this.answers.add(newInstance2);
                i12 += newInstance2.length();
            }
            for (int i17 = 0; i17 < nsCountAsInt; i17++) {
                int i18 = i11 - i12;
                if (i18 == 0) {
                    StringBuilder sb5 = new StringBuilder(200);
                    sb5.append("The data is too short to build an authority in DnsHeader. data: ");
                    sb5.append(ByteArrays.toHexString(bArr, " "));
                    sb5.append(", offset: ");
                    sb5.append(i10);
                    sb5.append(", length: ");
                    sb5.append(i11);
                    sb5.append(", cursor: ");
                    sb5.append(i12);
                    throw new IllegalRawDataException(sb5.toString());
                }
                DnsResourceRecord newInstance3 = DnsResourceRecord.newInstance(bArr, i10 + i12, i18);
                this.authorities.add(newInstance3);
                i12 += newInstance3.length();
            }
            for (int i19 = 0; i19 < arCountAsInt; i19++) {
                int i20 = i11 - i12;
                if (i20 == 0) {
                    StringBuilder sb6 = new StringBuilder(200);
                    sb6.append("The data is too short to build additional info in DnsHeader. data: ");
                    sb6.append(ByteArrays.toHexString(bArr, " "));
                    sb6.append(", offset: ");
                    sb6.append(i10);
                    sb6.append(", length: ");
                    sb6.append(i11);
                    sb6.append(", cursor: ");
                    sb6.append(i12);
                    throw new IllegalRawDataException(sb6.toString());
                }
                DnsResourceRecord newInstance4 = DnsResourceRecord.newInstance(bArr, i10 + i12, i20);
                this.additionalInfo.add(newInstance4);
                i12 += newInstance4.length();
            }
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[DNS Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  ID: ");
            sb2.append("0x" + ByteArrays.toHexString(this.f36241id, ""));
            sb2.append(property);
            sb2.append("  QR: ");
            sb2.append(this.response ? "response" : "query");
            sb2.append(property);
            sb2.append("  OPCODE: ");
            sb2.append(this.opCode);
            sb2.append(property);
            sb2.append("  Authoritative Answer: ");
            sb2.append(this.authoritativeAnswer);
            sb2.append(property);
            sb2.append("  Truncated: ");
            sb2.append(this.truncated);
            sb2.append(property);
            sb2.append("  Recursion Desired: ");
            sb2.append(this.recursionDesired);
            sb2.append(property);
            sb2.append("  Recursion Available: ");
            sb2.append(this.recursionAvailable);
            sb2.append(property);
            sb2.append("  Reserved Bit: ");
            sb2.append(this.reserved ? 1 : 0);
            sb2.append(property);
            sb2.append("  Authentic Data: ");
            sb2.append(this.authenticData);
            sb2.append(property);
            sb2.append("  Checking Disabled: ");
            sb2.append(this.checkingDisabled);
            sb2.append(property);
            sb2.append("  RCODE: ");
            sb2.append(this.rCode);
            sb2.append(property);
            sb2.append("  QDCOUNT: ");
            sb2.append((int) this.qdCount);
            sb2.append(property);
            sb2.append("  ANCOUNT: ");
            sb2.append((int) this.anCount);
            sb2.append(property);
            sb2.append("  NSCOUNT: ");
            sb2.append((int) this.nsCount);
            sb2.append(property);
            sb2.append("  ARCOUNT: ");
            sb2.append((int) this.arCount);
            sb2.append(property);
            byte[] rawData = getRawData();
            for (DnsQuestion dnsQuestion : this.questions) {
                sb2.append("  Question:");
                sb2.append(property);
                sb2.append(dnsQuestion.toString("    ", rawData));
            }
            for (DnsResourceRecord dnsResourceRecord : this.answers) {
                sb2.append("  Answer:");
                sb2.append(property);
                sb2.append(dnsResourceRecord.toString("    ", rawData));
            }
            for (DnsResourceRecord dnsResourceRecord2 : this.authorities) {
                sb2.append("  Authority:");
                sb2.append(property);
                sb2.append(dnsResourceRecord2.toString("    ", rawData));
            }
            for (DnsResourceRecord dnsResourceRecord3 : this.additionalInfo) {
                sb2.append("  Additional:");
                sb2.append(property);
                sb2.append(dnsResourceRecord3.toString("    ", rawData));
            }
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            int hashCode = this.additionalInfo.hashCode();
            short s10 = this.anCount;
            int hashCode2 = this.answers.hashCode();
            short s11 = this.arCount;
            int i10 = 1231;
            int i11 = this.authenticData ? 1231 : 1237;
            int i12 = this.authoritativeAnswer ? 1231 : 1237;
            int hashCode3 = this.authorities.hashCode();
            int i13 = this.checkingDisabled ? 1231 : 1237;
            short s12 = this.f36241id;
            short s13 = this.nsCount;
            int hashCode4 = this.opCode.hashCode();
            short s14 = this.qdCount;
            int hashCode5 = this.questions.hashCode();
            int hashCode6 = this.rCode.hashCode();
            int i14 = this.recursionAvailable ? 1231 : 1237;
            int i15 = this.recursionDesired ? 1231 : 1237;
            int i16 = this.reserved ? 1231 : 1237;
            int i17 = this.response ? 1231 : 1237;
            if (!this.truncated) {
                i10 = 1237;
            }
            return ((((((((((((((((((((((((((((((((((((527 + hashCode) * 31) + s10) * 31) + hashCode2) * 31) + s11) * 31) + i11) * 31) + i12) * 31) + hashCode3) * 31) + i13) * 31) + s12) * 31) + s13) * 31) + hashCode4) * 31) + s14) * 31) + hashCode5) * 31) + hashCode6) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + i17) * 31) + i10;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!super.equals(obj) || DnsHeader.class != obj.getClass()) {
                return false;
            }
            DnsHeader dnsHeader = (DnsHeader) obj;
            return this.additionalInfo.equals(dnsHeader.additionalInfo) && this.anCount == dnsHeader.anCount && this.answers.equals(dnsHeader.answers) && this.arCount == dnsHeader.arCount && this.authenticData == dnsHeader.authenticData && this.authoritativeAnswer == dnsHeader.authoritativeAnswer && this.authorities.equals(dnsHeader.authorities) && this.checkingDisabled == dnsHeader.checkingDisabled && this.f36241id == dnsHeader.f36241id && this.nsCount == dnsHeader.nsCount && this.opCode.equals(dnsHeader.opCode) && this.qdCount == dnsHeader.qdCount && this.questions.equals(dnsHeader.questions) && this.rCode.equals(dnsHeader.rCode) && this.recursionAvailable == dnsHeader.recursionAvailable && this.recursionDesired == dnsHeader.recursionDesired && this.reserved == dnsHeader.reserved && this.response == dnsHeader.response && this.truncated == dnsHeader.truncated;
        }

        public List<DnsResourceRecord> getAdditionalInfo() {
            return new ArrayList(this.additionalInfo);
        }

        public short getAnCount() {
            return this.anCount;
        }

        public int getAnCountAsInt() {
            return this.anCount & 65535;
        }

        public List<DnsResourceRecord> getAnswers() {
            return new ArrayList(this.answers);
        }

        public short getArCount() {
            return this.arCount;
        }

        public int getArCountAsInt() {
            return this.arCount & 65535;
        }

        public List<DnsResourceRecord> getAuthorities() {
            return new ArrayList(this.authorities);
        }

        public short getId() {
            return this.f36241id;
        }

        public short getNsCount() {
            return this.nsCount;
        }

        public int getNsCountAsInt() {
            return this.nsCount & 65535;
        }

        public DnsOpCode getOpCode() {
            return this.opCode;
        }

        public short getQdCount() {
            return this.qdCount;
        }

        public int getQdCountAsInt() {
            return this.qdCount & 65535;
        }

        public List<DnsQuestion> getQuestions() {
            return new ArrayList(this.questions);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.f36241id));
            byte byteValue = (byte) (this.opCode.value().byteValue() << 3);
            byte[] bArr = {byteValue, 0};
            if (this.response) {
                bArr[0] = (byte) (byteValue | 128);
            }
            if (this.authoritativeAnswer) {
                bArr[0] = (byte) (bArr[0] | 4);
            }
            if (this.truncated) {
                bArr[0] = (byte) (2 | bArr[0]);
            }
            if (this.recursionDesired) {
                bArr[0] = (byte) (bArr[0] | 1);
            }
            byte byteValue2 = this.rCode.value().byteValue();
            bArr[1] = byteValue2;
            if (this.recursionAvailable) {
                bArr[1] = (byte) (byteValue2 | 128);
            }
            if (this.reserved) {
                bArr[1] = (byte) (bArr[1] | 64);
            }
            if (this.authenticData) {
                bArr[1] = (byte) (bArr[1] | 32);
            }
            if (this.checkingDisabled) {
                bArr[1] = (byte) (bArr[1] | 16);
            }
            arrayList.add(bArr);
            arrayList.add(ByteArrays.toByteArray(this.qdCount));
            arrayList.add(ByteArrays.toByteArray(this.anCount));
            arrayList.add(ByteArrays.toByteArray(this.nsCount));
            arrayList.add(ByteArrays.toByteArray(this.arCount));
            Iterator<DnsQuestion> it = this.questions.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            Iterator<DnsResourceRecord> it2 = this.answers.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getRawData());
            }
            Iterator<DnsResourceRecord> it3 = this.authorities.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next().getRawData());
            }
            Iterator<DnsResourceRecord> it4 = this.additionalInfo.iterator();
            while (it4.hasNext()) {
                arrayList.add(it4.next().getRawData());
            }
            return arrayList;
        }

        public boolean getReservedBit() {
            return this.reserved;
        }

        public DnsRCode getrCode() {
            return this.rCode;
        }

        public boolean isAuthenticData() {
            return this.authenticData;
        }

        public boolean isAuthoritativeAnswer() {
            return this.authoritativeAnswer;
        }

        public boolean isCheckingDisabled() {
            return this.checkingDisabled;
        }

        public boolean isRecursionAvailable() {
            return this.recursionAvailable;
        }

        public boolean isRecursionDesired() {
            return this.recursionDesired;
        }

        public boolean isResponse() {
            return this.response;
        }

        public boolean isTruncated() {
            return this.truncated;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            int i10;
            Iterator<DnsQuestion> it = this.questions.iterator();
            int i11 = 12;
            while (true) {
                i10 = i11;
                if (!it.hasNext()) {
                    break;
                }
                i11 = i10 + it.next().length();
            }
            Iterator<DnsResourceRecord> it2 = this.answers.iterator();
            while (it2.hasNext()) {
                i10 += it2.next().length();
            }
            Iterator<DnsResourceRecord> it3 = this.authorities.iterator();
            while (it3.hasNext()) {
                i10 += it3.next().length();
            }
            Iterator<DnsResourceRecord> it4 = this.additionalInfo.iterator();
            while (it4.hasNext()) {
                i10 += it4.next().length();
            }
            return i10;
        }
    }

    private DnsPacket(Builder builder) {
        if (builder != null && builder.opCode != null && builder.rCode != null) {
            this.header = new DnsHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.opCode: " + builder.opCode + " builder.rCode: " + builder.rCode);
    }

    private DnsPacket(byte[] bArr, int i10, int i11) {
        this.header = new DnsHeader(bArr, i10, i11);
    }

    public static DnsPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public DnsHeader getHeader() {
        return this.header;
    }
}

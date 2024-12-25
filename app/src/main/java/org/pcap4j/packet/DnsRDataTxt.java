package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.DnsResourceRecord;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataTxt.class */
public final class DnsRDataTxt implements DnsResourceRecord.DnsRData {
    private static final long serialVersionUID = 469382715852386597L;
    private final List<String> texts;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsRDataTxt$Builder.class */
    public static final class Builder {
        private List<String> texts;

        public Builder() {
        }

        private Builder(DnsRDataTxt dnsRDataTxt) {
            this.texts = dnsRDataTxt.texts;
        }

        public DnsRDataTxt build() {
            return new DnsRDataTxt(this);
        }

        public Builder texts(List<String> list) {
            this.texts = list;
            return this;
        }
    }

    private DnsRDataTxt(Builder builder) {
        if (builder == null || builder.texts == null) {
            throw new NullPointerException("builder: " + builder + " builder.texts: " + builder.texts);
        }
        for (String str : builder.texts) {
            if (str.getBytes().length > 255) {
                throw new IllegalArgumentException("Length of a text must be less than 256. text: " + str);
            }
        }
        this.texts = new ArrayList(builder.texts);
    }

    private DnsRDataTxt(byte[] bArr, int i10, int i11) {
        this.texts = new ArrayList();
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i13 >= i11) {
                return;
            }
            int i14 = bArr[i10 + i13] & 255;
            int i15 = i13 + 1;
            if (i14 > i11 - i15) {
                StringBuilder sb2 = new StringBuilder(200);
                sb2.append("The data is too short to build a txt in DnsRDataTxt. data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                sb2.append(", cursor: ");
                sb2.append(i15);
                throw new IllegalRawDataException(sb2.toString());
            }
            this.texts.add(new String(bArr, i10 + i15, i14));
            i12 = i15 + i14;
        }
    }

    private String convertToString(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("TXT RDATA:");
        sb2.append(property);
        for (String str2 : this.texts) {
            sb2.append(str);
            sb2.append("  TEXT: ");
            sb2.append(str2);
            sb2.append(property);
        }
        return sb2.toString();
    }

    public static DnsRDataTxt newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsRDataTxt(bArr, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && DnsRDataTxt.class == obj.getClass() && this.texts.equals(((DnsRDataTxt) obj).texts);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public byte[] getRawData() {
        int i10;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.texts.iterator();
        int i11 = 0;
        while (true) {
            i10 = i11;
            if (!it.hasNext()) {
                break;
            }
            byte[] bytes = it.next().getBytes();
            arrayList.add(bytes);
            i11 = i10 + bytes.length + 1;
        }
        byte[] bArr = new byte[i10];
        Iterator it2 = arrayList.iterator();
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (!it2.hasNext()) {
                return bArr;
            }
            byte[] bArr2 = (byte[]) it2.next();
            bArr[i13] = (byte) bArr2.length;
            int i14 = i13 + 1;
            System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
            i12 = i14 + bArr2.length;
        }
    }

    public List<String> getTexts() {
        return new ArrayList(this.texts);
    }

    public int hashCode() {
        return 31 + this.texts.hashCode();
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public int length() {
        Iterator<String> it = this.texts.iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return i11;
            }
            i10 = i11 + it.next().getBytes().length + 1;
        }
    }

    public String toString() {
        return convertToString("", null);
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public String toString(String str) {
        return convertToString(str, null);
    }

    @Override // org.pcap4j.packet.DnsResourceRecord.DnsRData
    public String toString(String str, byte[] bArr) {
        if (bArr != null) {
            return convertToString(str, bArr);
        }
        throw new NullPointerException("headerRawData is null.");
    }
}

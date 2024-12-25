package org.pcap4j.packet;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.util.ByteArrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsDomainName.class */
public final class DnsDomainName implements Serializable {
    private static final Logger LOG = LoggerFactory.getLogger((Class<?>) DnsDomainName.class);
    public static final DnsDomainName ROOT_DOMAIN;
    private static final long serialVersionUID = -9123494137779222577L;
    private final List<String> labels;
    private final String name;
    private final Short pointer;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/DnsDomainName$Builder.class */
    public static final class Builder {
        private List<String> labels;
        private Short pointer;

        public Builder() {
            this.pointer = null;
        }

        private Builder(DnsDomainName dnsDomainName) {
            this.pointer = null;
            this.labels = dnsDomainName.labels;
            this.pointer = dnsDomainName.pointer;
        }

        public DnsDomainName build() {
            return new DnsDomainName(this);
        }

        public Builder labels(List<String> list) {
            this.labels = list;
            return this;
        }

        public Builder labels(String[] strArr) {
            this.labels = Arrays.asList(strArr);
            return this;
        }

        public Builder pointer(Short sh2) {
            this.pointer = sh2;
            return this;
        }
    }

    static {
        try {
            ROOT_DOMAIN = new DnsDomainName(new byte[]{0}, 0, 1);
        } catch (IllegalRawDataException e10) {
            throw new AssertionError("Never get here.");
        }
    }

    private DnsDomainName(Builder builder) {
        if (builder == null || builder.labels == null) {
            throw new NullPointerException("builder" + builder + " builder.labels: " + builder.labels);
        }
        for (String str : builder.labels) {
            if (str.getBytes().length > 63) {
                throw new IllegalArgumentException("Length of a label must be less than 64. label: " + str);
            }
        }
        if (builder.pointer != null && (builder.pointer.shortValue() & 49152) != 0) {
            throw new IllegalArgumentException("(builder.pointer & 0xC000) must be zero. builder.pointer: " + builder.pointer);
        }
        ArrayList arrayList = new ArrayList(builder.labels);
        this.labels = arrayList;
        this.name = joinLabels(arrayList);
        this.pointer = builder.pointer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x019f, code lost:
    
        r7.pointer = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x01a7, code lost:
    
        if (r11 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01aa, code lost:
    
        r7.name = joinLabels(r7.labels);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01b6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01b7, code lost:
    
        r0 = new java.lang.StringBuilder(200);
        r0.append("No null termination nor pointer. data: ");
        r0.append(org.pcap4j.util.ByteArrays.toHexString(r8, " "));
        r0.append(", offset: ");
        r0.append(r9);
        r0.append(", length: ");
        r0.append(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0201, code lost:
    
        throw new org.pcap4j.packet.IllegalRawDataException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private DnsDomainName(byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pcap4j.packet.DnsDomainName.<init>(byte[], int, int):void");
    }

    private String decompress(byte[] bArr, List<Short> list) {
        Short sh2 = this.pointer;
        if (sh2 == null) {
            return this.name;
        }
        if (!list.contains(sh2)) {
            list.add(this.pointer);
            return this.name + InstructionFileId.DOT + new DnsDomainName(bArr, this.pointer.shortValue(), bArr.length - this.pointer.shortValue()).decompress(bArr, list);
        }
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("Circular reference detected. data: ");
        sb2.append(ByteArrays.toHexString(bArr, " "));
        sb2.append(", offset: ");
        sb2.append(this.pointer);
        sb2.append(", name: ");
        sb2.append(this.name);
        throw new IllegalRawDataException(sb2.toString());
    }

    private String joinLabels(List<String> list) {
        if (list.size() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (true) {
            sb2.append(it.next());
            if (!it.hasNext()) {
                return sb2.toString();
            }
            sb2.append(InstructionFileId.DOT);
        }
    }

    public static DnsDomainName newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new DnsDomainName(bArr, i10, i11);
    }

    public String decompress(byte[] bArr) {
        if (bArr != null) {
            return decompress(bArr, new ArrayList());
        }
        throw new NullPointerException("headerRawData is null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DnsDomainName.class != obj.getClass()) {
            return false;
        }
        DnsDomainName dnsDomainName = (DnsDomainName) obj;
        if (!this.name.equals(dnsDomainName.name)) {
            return false;
        }
        Short sh2 = this.pointer;
        Short sh3 = dnsDomainName.pointer;
        return sh2 == null ? sh3 == null : sh2.equals(sh3);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public List<String> getLabels() {
        return new ArrayList(this.labels);
    }

    public String getName() {
        return this.name;
    }

    public Short getPointer() {
        return this.pointer;
    }

    public Integer getPointerAsInt() {
        Short sh2 = this.pointer;
        if (sh2 != null) {
            return Integer.valueOf(sh2.shortValue());
        }
        return null;
    }

    public byte[] getRawData() {
        int i10;
        byte[] bArr = new byte[length()];
        Iterator<String> it = this.labels.iterator();
        int i11 = 0;
        while (true) {
            i10 = i11;
            if (!it.hasNext()) {
                break;
            }
            byte[] bytes = it.next().getBytes();
            bArr[i10] = (byte) bytes.length;
            int i12 = i10 + 1;
            System.arraycopy(bytes, 0, bArr, i12, bytes.length);
            i11 = i12 + bytes.length;
        }
        Short sh2 = this.pointer;
        if (sh2 != null) {
            byte[] byteArray = ByteArrays.toByteArray(sh2.shortValue());
            byteArray[0] = (byte) (byteArray[0] | 192);
            System.arraycopy(byteArray, 0, bArr, i10, byteArray.length);
        }
        return bArr;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode();
        Short sh2 = this.pointer;
        return ((hashCode + 31) * 31) + (sh2 == null ? 0 : sh2.hashCode());
    }

    public int length() {
        int i10;
        Iterator<String> it = this.labels.iterator();
        int i11 = 0;
        while (true) {
            i10 = i11;
            if (!it.hasNext()) {
                break;
            }
            i11 = i10 + it.next().length() + 1;
        }
        return this.pointer != null ? i10 + 2 : i10 + 1;
    }

    public String toString() {
        if (this.labels.size() == 0 && this.pointer == null) {
            return "<ROOT>";
        }
        if (this.pointer == null) {
            return this.name;
        }
        return "[name: " + this.name + ", pointer: " + this.pointer + "]";
    }

    public String toString(byte[] bArr) {
        String str;
        if (this.labels.size() == 0 && this.pointer == null) {
            return "<ROOT>";
        }
        if (this.pointer == null) {
            return this.name;
        }
        try {
            str = decompress(bArr);
        } catch (IllegalRawDataException e10) {
            LOG.error("Error occurred during building complete name.", (Throwable) e10);
            str = "Error occurred during building complete name";
        }
        return str + " (name: " + this.name + ", pointer: " + this.pointer + ")";
    }
}

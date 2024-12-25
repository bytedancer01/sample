package org.minidns.dnsname;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.minidns.dnslabel.DnsLabel;
import org.minidns.dnsname.InvalidDnsNameException;
import org.minidns.idna.MiniDnsIdna;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnsname/DnsName.class */
public final class DnsName implements CharSequence, Serializable, Comparable<DnsName> {
    public static final boolean $assertionsDisabled = false;
    private static final String LABEL_SEP_REGEX = "[.。．｡]";
    public static final int MAX_DNSNAME_LENGTH_IN_OCTETS = 255;
    public static final int MAX_LABELS = 128;
    private static final long serialVersionUID = 1;
    public final String ace;
    private transient byte[] bytes;
    private transient String domainpart;
    private transient int hashCode;
    private transient String hostpart;
    private transient String idn;
    private transient DnsLabel[] labels;
    private final String rawAce;
    private transient byte[] rawBytes;
    private transient DnsLabel[] rawLabels;
    private int size;
    public static final DnsName ROOT = new DnsName(InstructionFileId.DOT);
    public static final DnsName IN_ADDR_ARPA = new DnsName("in-addr.arpa");
    public static final DnsName IP6_ARPA = new DnsName("ip6.arpa");
    public static boolean VALIDATE = true;

    private DnsName(String str) {
        this(str, true);
    }

    private DnsName(String str, boolean z10) {
        String str2;
        this.size = -1;
        if (str.isEmpty()) {
            str2 = ROOT.rawAce;
        } else {
            int length = str.length();
            int i10 = length - 1;
            str2 = str;
            if (length >= 2) {
                str2 = str;
                if (str.charAt(i10) == '.') {
                    str2 = str.subSequence(0, i10).toString();
                }
            }
            if (!z10) {
                str2 = MiniDnsIdna.toASCII(str2);
            }
        }
        this.rawAce = str2;
        this.ace = this.rawAce.toLowerCase(Locale.US);
        if (VALIDATE) {
            validateMaxDnsnameLengthInOctets();
        }
    }

    private DnsName(DnsLabel[] dnsLabelArr, boolean z10) {
        this.size = -1;
        this.rawLabels = dnsLabelArr;
        this.labels = new DnsLabel[dnsLabelArr.length];
        int i10 = 0;
        for (int i11 = 0; i11 < dnsLabelArr.length; i11++) {
            i10 += dnsLabelArr[i11].length() + 1;
            this.labels[i11] = dnsLabelArr[i11].asLowercaseVariant();
        }
        this.rawAce = labelsToString(dnsLabelArr, i10);
        this.ace = labelsToString(this.labels, i10);
        if (z10 && VALIDATE) {
            validateMaxDnsnameLengthInOctets();
        }
    }

    public static DnsName from(CharSequence charSequence) {
        return from(charSequence.toString());
    }

    public static DnsName from(String str) {
        return new DnsName(str, false);
    }

    public static DnsName from(DnsLabel dnsLabel, DnsLabel dnsLabel2, DnsName dnsName) {
        dnsName.setBytesIfRequired();
        DnsLabel[] dnsLabelArr = dnsName.rawLabels;
        DnsLabel[] dnsLabelArr2 = new DnsLabel[dnsLabelArr.length + 2];
        System.arraycopy(dnsLabelArr, 0, dnsLabelArr2, 0, dnsLabelArr.length);
        DnsLabel[] dnsLabelArr3 = dnsName.rawLabels;
        dnsLabelArr2[dnsLabelArr3.length] = dnsLabel2;
        dnsLabelArr2[dnsLabelArr3.length + 1] = dnsLabel;
        return new DnsName(dnsLabelArr2, true);
    }

    public static DnsName from(DnsLabel dnsLabel, DnsName dnsName) {
        dnsName.setLabelsIfRequired();
        DnsLabel[] dnsLabelArr = dnsName.rawLabels;
        int length = dnsLabelArr.length + 1;
        DnsLabel[] dnsLabelArr2 = new DnsLabel[length];
        System.arraycopy(dnsLabelArr, 0, dnsLabelArr2, 0, dnsLabelArr.length);
        dnsLabelArr2[length] = dnsLabel;
        return new DnsName(dnsLabelArr2, true);
    }

    public static DnsName from(DnsName dnsName, DnsName dnsName2) {
        dnsName.setLabelsIfRequired();
        dnsName2.setLabelsIfRequired();
        int length = dnsName.rawLabels.length;
        DnsLabel[] dnsLabelArr = dnsName2.rawLabels;
        DnsLabel[] dnsLabelArr2 = new DnsLabel[length + dnsLabelArr.length];
        System.arraycopy(dnsLabelArr, 0, dnsLabelArr2, 0, dnsLabelArr.length);
        DnsLabel[] dnsLabelArr3 = dnsName.rawLabels;
        System.arraycopy(dnsLabelArr3, 0, dnsLabelArr2, dnsName2.rawLabels.length, dnsLabelArr3.length);
        return new DnsName(dnsLabelArr2, true);
    }

    public static DnsName from(String[] strArr) {
        return new DnsName(DnsLabel.from(strArr), true);
    }

    public static DnsName from(DnsName... dnsNameArr) {
        int i10 = 0;
        for (DnsName dnsName : dnsNameArr) {
            dnsName.setLabelsIfRequired();
            i10 += dnsName.rawLabels.length;
        }
        DnsLabel[] dnsLabelArr = new DnsLabel[i10];
        int i11 = 0;
        for (int length = dnsNameArr.length - 1; length >= 0; length--) {
            DnsName dnsName2 = dnsNameArr[length];
            DnsLabel[] dnsLabelArr2 = dnsName2.rawLabels;
            System.arraycopy(dnsLabelArr2, 0, dnsLabelArr, i11, dnsLabelArr2.length);
            i11 += dnsName2.rawLabels.length;
        }
        return new DnsName(dnsLabelArr, true);
    }

    private static DnsLabel[] getLabels(String str) {
        String[] split = str.split(LABEL_SEP_REGEX, 128);
        for (int i10 = 0; i10 < split.length / 2; i10++) {
            String str2 = split[i10];
            int length = (split.length - i10) - 1;
            split[i10] = split[length];
            split[length] = str2;
        }
        try {
            return DnsLabel.from(split);
        } catch (DnsLabel.LabelToLongException e10) {
            throw new InvalidDnsNameException.LabelTooLongException(str, e10.label);
        }
    }

    private static String labelsToString(DnsLabel[] dnsLabelArr, int i10) {
        StringBuilder sb2 = new StringBuilder(i10);
        for (int length = dnsLabelArr.length - 1; length >= 0; length--) {
            sb2.append((CharSequence) dnsLabelArr[length]);
            sb2.append('.');
        }
        sb2.setLength(sb2.length() - 1);
        return sb2.toString();
    }

    public static DnsName parse(DataInputStream dataInputStream, byte[] bArr) {
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if ((readUnsignedByte & 192) == 192) {
            int readUnsignedByte2 = ((readUnsignedByte & 63) << 8) + dataInputStream.readUnsignedByte();
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(readUnsignedByte2));
            return parse(bArr, readUnsignedByte2, hashSet);
        }
        if (readUnsignedByte == 0) {
            return ROOT;
        }
        byte[] bArr2 = new byte[readUnsignedByte];
        dataInputStream.readFully(bArr2);
        return from(new DnsName(new String(bArr2, StandardCharsets.US_ASCII)), parse(dataInputStream, bArr));
    }

    private static DnsName parse(byte[] bArr, int i10, HashSet<Integer> hashSet) {
        int i11 = bArr[i10] & 255;
        if ((i11 & 192) != 192) {
            if (i11 == 0) {
                return ROOT;
            }
            int i12 = i10 + 1;
            return from(new DnsName(new String(bArr, i12, i11, StandardCharsets.US_ASCII)), parse(bArr, i12 + i11, hashSet));
        }
        int i13 = ((i11 & 63) << 8) + (bArr[i10 + 1] & 255);
        if (hashSet.contains(Integer.valueOf(i13))) {
            throw new IllegalStateException("Cyclic offsets detected.");
        }
        hashSet.add(Integer.valueOf(i13));
        return parse(bArr, i13, hashSet);
    }

    private void setBytesIfRequired() {
        if (this.bytes != null) {
            return;
        }
        setLabelsIfRequired();
        this.bytes = toBytes(this.labels);
    }

    private void setHostnameAndDomainpartIfRequired() {
        if (this.hostpart != null) {
            return;
        }
        String[] split = this.ace.split(LABEL_SEP_REGEX, 2);
        this.hostpart = split[0];
        this.domainpart = split.length > 1 ? split[1] : "";
    }

    private void setLabelsIfRequired() {
        if (this.labels == null || this.rawLabels == null) {
            if (!isRootLabel()) {
                this.labels = getLabels(this.ace);
                this.rawLabels = getLabels(this.rawAce);
            } else {
                DnsLabel[] dnsLabelArr = new DnsLabel[0];
                this.labels = dnsLabelArr;
                this.rawLabels = dnsLabelArr;
            }
        }
    }

    private static byte[] toBytes(DnsLabel[] dnsLabelArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        for (int length = dnsLabelArr.length - 1; length >= 0; length--) {
            dnsLabelArr[length].writeToBoas(byteArrayOutputStream);
        }
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }

    private void validateMaxDnsnameLengthInOctets() {
        setBytesIfRequired();
        if (this.bytes.length > 255) {
            throw new InvalidDnsNameException.DNSNameTooLongException(this.ace, this.bytes);
        }
    }

    public String asIdn() {
        String str = this.idn;
        if (str != null) {
            return str;
        }
        String unicode = MiniDnsIdna.toUnicode(this.ace);
        this.idn = unicode;
        return unicode;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.ace.charAt(i10);
    }

    @Override // java.lang.Comparable
    public int compareTo(DnsName dnsName) {
        return this.ace.compareTo(dnsName.ace);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof DnsName)) {
            return false;
        }
        DnsName dnsName = (DnsName) obj;
        setBytesIfRequired();
        dnsName.setBytesIfRequired();
        return Arrays.equals(this.bytes, dnsName.bytes);
    }

    public byte[] getBytes() {
        setBytesIfRequired();
        return (byte[]) this.bytes.clone();
    }

    public String getDomainpart() {
        setHostnameAndDomainpartIfRequired();
        return this.domainpart;
    }

    public String getHostpart() {
        setHostnameAndDomainpartIfRequired();
        return this.hostpart;
    }

    public DnsLabel getHostpartLabel() {
        setLabelsIfRequired();
        DnsLabel[] dnsLabelArr = this.labels;
        return dnsLabelArr[dnsLabelArr.length];
    }

    public DnsLabel getLabel(int i10) {
        setLabelsIfRequired();
        return this.labels[i10];
    }

    public int getLabelCount() {
        setLabelsIfRequired();
        return this.labels.length;
    }

    public DnsLabel[] getLabels() {
        setLabelsIfRequired();
        return (DnsLabel[]) this.labels.clone();
    }

    public DnsName getParent() {
        return isRootLabel() ? ROOT : stripToLabels(getLabelCount() - 1);
    }

    public String getRawAce() {
        return this.rawAce;
    }

    public byte[] getRawBytes() {
        if (this.rawBytes == null) {
            setLabelsIfRequired();
            this.rawBytes = toBytes(this.rawLabels);
        }
        return (byte[]) this.rawBytes.clone();
    }

    public DnsLabel[] getRawLabels() {
        setLabelsIfRequired();
        return (DnsLabel[]) this.rawLabels.clone();
    }

    public int hashCode() {
        if (this.hashCode == 0 && !isRootLabel()) {
            setBytesIfRequired();
            this.hashCode = Arrays.hashCode(this.bytes);
        }
        return this.hashCode;
    }

    public boolean isChildOf(DnsName dnsName) {
        setLabelsIfRequired();
        dnsName.setLabelsIfRequired();
        if (this.labels.length < dnsName.labels.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            DnsLabel[] dnsLabelArr = dnsName.labels;
            if (i10 >= dnsLabelArr.length) {
                return true;
            }
            if (!this.labels[i10].equals(dnsLabelArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    public boolean isDirectChildOf(DnsName dnsName) {
        setLabelsIfRequired();
        dnsName.setLabelsIfRequired();
        if (this.labels.length - 1 != dnsName.labels.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            DnsLabel[] dnsLabelArr = dnsName.labels;
            if (i10 >= dnsLabelArr.length) {
                return true;
            }
            if (!this.labels[i10].equals(dnsLabelArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    public boolean isRootLabel() {
        return this.ace.isEmpty() || this.ace.equals(InstructionFileId.DOT);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.ace.length();
    }

    public int size() {
        if (this.size < 0) {
            this.size = isRootLabel() ? 1 : this.ace.length() + 2;
        }
        return this.size;
    }

    public DnsName stripToLabels(int i10) {
        setLabelsIfRequired();
        DnsLabel[] dnsLabelArr = this.labels;
        if (i10 <= dnsLabelArr.length) {
            return i10 == dnsLabelArr.length ? this : i10 == 0 ? ROOT : new DnsName((DnsLabel[]) Arrays.copyOfRange(this.rawLabels, 0, i10), false);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.ace.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.ace;
    }

    public void writeToStream(OutputStream outputStream) {
        setBytesIfRequired();
        outputStream.write(this.bytes);
    }
}

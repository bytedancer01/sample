package org.pcap4j.packet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2NameList.class */
public final class Ssh2NameList implements Serializable {
    private static final long serialVersionUID = 8625201821104360377L;
    private final int length;
    private final List<String> list;

    public Ssh2NameList(List<String> list) {
        if (list == null) {
            throw new NullPointerException("list may not be null");
        }
        this.list = new ArrayList(list);
        this.length = calcLength();
    }

    public Ssh2NameList(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        if (i11 < 4) {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append("The rawData length must be more than 3. rawData: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }
        int i12 = ByteArrays.getInt(bArr, i10);
        this.length = i12;
        if (i12 < 0) {
            StringBuilder sb3 = new StringBuilder(120);
            sb3.append("A name-list the length of which is longer than 2147483647 is not supported. length: ");
            sb3.append(i12 & 4294967295L);
            throw new IllegalRawDataException(sb3.toString());
        }
        if (i11 - 4 >= i12) {
            this.list = Arrays.asList(new String(bArr, i10 + 4, i12).split(","));
            return;
        }
        StringBuilder sb4 = new StringBuilder(110);
        sb4.append("The data is too short to build an Ssh2NameList (");
        sb4.append(i12 + 4);
        sb4.append(" bytes). data: ");
        sb4.append(ByteArrays.toHexString(bArr, " "));
        sb4.append(", offset: ");
        sb4.append(i10);
        sb4.append(", length: ");
        sb4.append(i11);
        throw new IllegalRawDataException(sb4.toString());
    }

    public Ssh2NameList(String... strArr) {
        this.list = new ArrayList();
        for (String str : strArr) {
            this.list.add(str);
        }
        this.length = calcLength();
    }

    private int calcLength() {
        Iterator<String> it = this.list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int length = i10 + it.next().length();
            i10 = length;
            if (it.hasNext()) {
                i10 = length + 1;
            }
        }
        return i10;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!Ssh2NameList.class.isInstance(obj)) {
            return false;
        }
        Ssh2NameList ssh2NameList = (Ssh2NameList) obj;
        if (this.length != ssh2NameList.length || !this.list.equals(ssh2NameList.list)) {
            z10 = false;
        }
        return z10;
    }

    public int getLength() {
        return this.length;
    }

    public List<String> getList() {
        return new ArrayList(this.list);
    }

    public byte[] getRawData() {
        String ssh2NameList = toString();
        byte[] bArr = new byte[ssh2NameList.length() + 4];
        System.arraycopy(ByteArrays.toByteArray(this.length), 0, bArr, 0, 4);
        System.arraycopy(ssh2NameList.getBytes(), 0, bArr, 4, ssh2NameList.length());
        return bArr;
    }

    public int hashCode() {
        return ((527 + this.length) * 31) + this.list.hashCode();
    }

    public int length() {
        return getRawData().length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.length);
        Iterator<String> it = this.list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }
}

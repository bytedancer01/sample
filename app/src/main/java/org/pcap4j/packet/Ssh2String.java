package org.pcap4j.packet;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2String.class */
public final class Ssh2String implements Serializable {
    private static final long serialVersionUID = -1591381991570120515L;
    private final int length;
    private final byte[] string;

    public Ssh2String(String str) {
        str.getClass();
        try {
            byte[] bytes = str.getBytes("UTF-8");
            this.string = bytes;
            this.length = bytes.length;
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError("Never get here.");
        }
    }

    public Ssh2String(byte[] bArr, int i10, int i11) {
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
            sb3.append("A string the length of which is longer than 2147483647 is not supported. length: ");
            sb3.append(i12 & 4294967295L);
            throw new IllegalRawDataException(sb3.toString());
        }
        if (i11 - 4 >= i12) {
            this.string = ByteArrays.getSubArray(bArr, i10 + 4, i12);
            return;
        }
        StringBuilder sb4 = new StringBuilder(110);
        sb4.append("The data is too short to build an Ssh2String (");
        sb4.append(i12 + 4);
        sb4.append(" bytes). data: ");
        sb4.append(ByteArrays.toHexString(bArr, " "));
        sb4.append(", offset: ");
        sb4.append(i10);
        sb4.append(", length: ");
        sb4.append(i11);
        throw new IllegalRawDataException(sb4.toString());
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!Ssh2String.class.isInstance(obj)) {
            return false;
        }
        Ssh2String ssh2String = (Ssh2String) obj;
        if (this.length != ssh2String.length || !Arrays.equals(this.string, ssh2String.string)) {
            z10 = false;
        }
        return z10;
    }

    public int getLength() {
        return this.length;
    }

    public byte[] getRawData() {
        int i10 = this.length;
        byte[] bArr = new byte[i10 + 4];
        System.arraycopy(ByteArrays.toByteArray(i10), 0, bArr, 0, 4);
        System.arraycopy(this.string, 0, bArr, 4, this.length);
        return bArr;
    }

    public byte[] getString() {
        return ByteArrays.clone(this.string);
    }

    public String getStringAsString() {
        try {
            return new String(this.string, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError("Never get here.");
        }
    }

    public int hashCode() {
        return ((527 + this.length) * 31) + Arrays.hashCode(this.string);
    }

    public int length() {
        return this.length + 4;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append(getStringAsString());
        sb2.append(" (");
        sb2.append(ByteArrays.toHexString(this.string, " "));
        sb2.append(")");
        return sb2.toString();
    }
}

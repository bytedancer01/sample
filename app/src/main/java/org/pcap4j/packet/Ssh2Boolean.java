package org.pcap4j.packet;

import java.io.Serializable;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2Boolean.class */
public final class Ssh2Boolean implements Serializable {
    private static final long serialVersionUID = 951415749644317915L;
    private final byte rawData;
    public static final Ssh2Boolean TRUE = new Ssh2Boolean((byte) 1);
    public static final Ssh2Boolean FALSE = new Ssh2Boolean((byte) 0);

    public Ssh2Boolean(byte b10) {
        this.rawData = b10;
    }

    public Ssh2Boolean(byte[] bArr, int i10) {
        ByteArrays.validateBounds(bArr, i10, 1);
        this.rawData = bArr[i10];
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!Ssh2Boolean.class.isInstance(obj)) {
            return false;
        }
        if (((Ssh2Boolean) obj).rawData != this.rawData) {
            z10 = false;
        }
        return z10;
    }

    public byte[] getRawData() {
        return new byte[]{this.rawData};
    }

    public boolean getValue() {
        return this.rawData != 0;
    }

    public int hashCode() {
        return this.rawData;
    }

    public int length() {
        return 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append(getValue());
        sb2.append("(0x");
        sb2.append(ByteArrays.toHexString(this.rawData, ""));
        sb2.append(")");
        return sb2.toString();
    }
}

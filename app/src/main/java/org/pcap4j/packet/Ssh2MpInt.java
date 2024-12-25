package org.pcap4j.packet;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Ssh2MpInt.class */
public final class Ssh2MpInt implements Serializable, Comparable<Ssh2MpInt> {
    private static final long serialVersionUID = 5539706044412185073L;
    private final int length;
    private final byte[] value;

    public Ssh2MpInt(long j10) {
        byte[] bArr;
        int i10;
        byte[] byteArray = ByteArrays.toByteArray(j10);
        if (-128 <= j10 && 127 <= j10) {
            i10 = 7;
        } else if (-32768 <= j10 && j10 <= 32767) {
            i10 = 6;
        } else if (-8388608 <= j10 && j10 <= 8388607) {
            i10 = 5;
        } else if (-2147483648L <= j10 && j10 <= 2147483647L) {
            i10 = 4;
        } else if (0 <= j10 && j10 <= 549755813887L) {
            i10 = 3;
        } else {
            if (0 > j10 || j10 > 140737488355327L) {
                bArr = byteArray;
                if (0 <= j10) {
                    bArr = byteArray;
                    if (j10 <= 36028797018963967L) {
                        i10 = 1;
                    }
                }
                this.value = bArr;
                this.length = bArr.length;
            }
            i10 = 2;
        }
        bArr = ByteArrays.getSubArray(byteArray, i10);
        this.value = bArr;
        this.length = bArr.length;
    }

    public Ssh2MpInt(byte[] bArr, int i10, int i11) {
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
            sb3.append("A mp-int the length of which is longer than 2147483647 is not supported. length: ");
            sb3.append(i12 & 4294967295L);
            throw new IllegalRawDataException(sb3.toString());
        }
        if (i11 - 4 >= i12) {
            this.value = ByteArrays.getSubArray(bArr, i10 + 4, i12);
            return;
        }
        StringBuilder sb4 = new StringBuilder(110);
        sb4.append("The data is too short to build an Ssh2MpInt (");
        sb4.append(i12 + 4);
        sb4.append(" bytes). data: ");
        sb4.append(ByteArrays.toHexString(bArr, " "));
        sb4.append(", offset: ");
        sb4.append(i10);
        sb4.append(", length: ");
        sb4.append(i11);
        throw new IllegalRawDataException(sb4.toString());
    }

    @Override // java.lang.Comparable
    public int compareTo(Ssh2MpInt ssh2MpInt) {
        return getValueAsBigInteger().compareTo(ssh2MpInt.getValueAsBigInteger());
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!Ssh2MpInt.class.isInstance(obj)) {
            return false;
        }
        Ssh2MpInt ssh2MpInt = (Ssh2MpInt) obj;
        if (this.length != ssh2MpInt.length || !Arrays.equals(this.value, ssh2MpInt.value)) {
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
        System.arraycopy(this.value, 0, bArr, 4, this.length);
        return bArr;
    }

    public byte[] getValue() {
        return ByteArrays.clone(this.value);
    }

    public BigInteger getValueAsBigInteger() {
        return new BigInteger(this.value);
    }

    public int hashCode() {
        return ((527 + this.length) * 31) + Arrays.hashCode(this.value);
    }

    public int length() {
        return this.length + 4;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append(getValueAsBigInteger());
        sb2.append(" (");
        sb2.append(ByteArrays.toHexString(this.value, " "));
        sb2.append(")");
        return sb2.toString();
    }
}

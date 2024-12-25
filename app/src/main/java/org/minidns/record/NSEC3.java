package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.minidns.dnslabel.DnsLabel;
import org.minidns.record.Record;
import org.minidns.util.Base32;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/NSEC3.class */
public class NSEC3 extends Data {
    public static final boolean $assertionsDisabled = false;
    public static final byte FLAG_OPT_OUT = 1;
    private static final Map<Byte, HashAlgorithm> HASH_ALGORITHM_LUT = new HashMap();
    public final byte flags;
    public final HashAlgorithm hashAlgorithm;
    public final byte hashAlgorithmByte;
    public final int iterations;
    private final byte[] nextHashed;
    private String nextHashedBase32Cache;
    private DnsLabel nextHashedDnsLabelCache;
    private final byte[] salt;
    private final byte[] typeBitmap;
    public final List<Record.TYPE> types;

    /* loaded from: combined.jar:classes3.jar:org/minidns/record/NSEC3$HashAlgorithm.class */
    public enum HashAlgorithm {
        RESERVED(0, "Reserved"),
        SHA1(1, MessageDigestAlgorithms.SHA_1);

        public final String description;
        public final byte value;

        HashAlgorithm(int i10, String str) {
            if (i10 < 0 || i10 > 255) {
                throw new IllegalArgumentException();
            }
            byte b10 = (byte) i10;
            this.value = b10;
            this.description = str;
            NSEC3.HASH_ALGORITHM_LUT.put(Byte.valueOf(b10), this);
        }

        public static HashAlgorithm forByte(byte b10) {
            return (HashAlgorithm) NSEC3.HASH_ALGORITHM_LUT.get(Byte.valueOf(b10));
        }
    }

    public NSEC3(byte b10, byte b11, int i10, byte[] bArr, byte[] bArr2, List<Record.TYPE> list) {
        this(null, b10, b11, i10, bArr, bArr2, list);
    }

    public NSEC3(byte b10, byte b11, int i10, byte[] bArr, byte[] bArr2, Record.TYPE... typeArr) {
        this(null, b10, b11, i10, bArr, bArr2, Arrays.asList(typeArr));
    }

    private NSEC3(HashAlgorithm hashAlgorithm, byte b10, byte b11, int i10, byte[] bArr, byte[] bArr2, List<Record.TYPE> list) {
        this.hashAlgorithmByte = b10;
        this.hashAlgorithm = hashAlgorithm == null ? HashAlgorithm.forByte(b10) : hashAlgorithm;
        this.flags = b11;
        this.iterations = i10;
        this.salt = bArr;
        this.nextHashed = bArr2;
        this.types = list;
        this.typeBitmap = NSEC.createTypeBitMap(list);
    }

    public static NSEC3 parse(DataInputStream dataInputStream, int i10) {
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        byte[] bArr = new byte[readUnsignedByte];
        if (dataInputStream.read(bArr) != readUnsignedByte) {
            throw new IOException();
        }
        int readUnsignedByte2 = dataInputStream.readUnsignedByte();
        byte[] bArr2 = new byte[readUnsignedByte2];
        if (dataInputStream.read(bArr2) != readUnsignedByte2) {
            throw new IOException();
        }
        int i11 = i10 - ((readUnsignedByte + 6) + readUnsignedByte2);
        byte[] bArr3 = new byte[i11];
        if (dataInputStream.read(bArr3) == i11) {
            return new NSEC3(readByte, readByte2, readUnsignedShort, bArr, bArr2, NSEC.readTypeBitMap(bArr3));
        }
        throw new IOException();
    }

    public void copySaltInto(byte[] bArr, int i10) {
        byte[] bArr2 = this.salt;
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
    }

    public byte[] getNextHashed() {
        return (byte[]) this.nextHashed.clone();
    }

    public String getNextHashedBase32() {
        if (this.nextHashedBase32Cache == null) {
            this.nextHashedBase32Cache = Base32.encodeToString(this.nextHashed);
        }
        return this.nextHashedBase32Cache;
    }

    public DnsLabel getNextHashedDnsLabel() {
        if (this.nextHashedDnsLabelCache == null) {
            this.nextHashedDnsLabelCache = DnsLabel.from(getNextHashedBase32());
        }
        return this.nextHashedDnsLabelCache;
    }

    public byte[] getSalt() {
        return (byte[]) this.salt.clone();
    }

    public int getSaltLength() {
        return this.salt.length;
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.NSEC3;
    }

    @Override // org.minidns.record.Data
    public void serialize(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.hashAlgorithmByte);
        dataOutputStream.writeByte(this.flags);
        dataOutputStream.writeShort(this.iterations);
        dataOutputStream.writeByte(this.salt.length);
        dataOutputStream.write(this.salt);
        dataOutputStream.writeByte(this.nextHashed.length);
        dataOutputStream.write(this.nextHashed);
        dataOutputStream.write(this.typeBitmap);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.hashAlgorithm);
        sb2.append(' ');
        sb2.append((int) this.flags);
        sb2.append(' ');
        sb2.append(this.iterations);
        sb2.append(' ');
        sb2.append(this.salt.length == 0 ? "-" : new BigInteger(1, this.salt).toString(16).toUpperCase());
        sb2.append(' ');
        sb2.append(Base32.encodeToString(this.nextHashed));
        for (Record.TYPE type : this.types) {
            sb2.append(' ');
            sb2.append(type);
        }
        return sb2.toString();
    }
}

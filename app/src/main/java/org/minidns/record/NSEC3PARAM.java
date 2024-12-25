package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import org.minidns.record.NSEC3;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/NSEC3PARAM.class */
public class NSEC3PARAM extends Data {
    public static final boolean $assertionsDisabled = false;
    public final byte flags;
    public final NSEC3.HashAlgorithm hashAlgorithm;
    public final byte hashAlgorithmByte;
    public final int iterations;
    private final byte[] salt;

    public NSEC3PARAM(byte b10, byte b11, int i10, byte[] bArr) {
        this(null, b10, b11, i10, bArr);
    }

    private NSEC3PARAM(NSEC3.HashAlgorithm hashAlgorithm, byte b10, byte b11, int i10, byte[] bArr) {
        this.hashAlgorithmByte = b10;
        this.hashAlgorithm = hashAlgorithm == null ? NSEC3.HashAlgorithm.forByte(b10) : hashAlgorithm;
        this.flags = b11;
        this.iterations = i10;
        this.salt = bArr;
    }

    public static NSEC3PARAM parse(DataInputStream dataInputStream) {
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        byte[] bArr = new byte[readUnsignedByte];
        if (dataInputStream.read(bArr) == readUnsignedByte || readUnsignedByte == 0) {
            return new NSEC3PARAM(readByte, readByte2, readUnsignedShort, bArr);
        }
        throw new IOException();
    }

    public int getSaltLength() {
        return this.salt.length;
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.NSEC3PARAM;
    }

    @Override // org.minidns.record.Data
    public void serialize(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.hashAlgorithmByte);
        dataOutputStream.writeByte(this.flags);
        dataOutputStream.writeShort(this.iterations);
        dataOutputStream.writeByte(this.salt.length);
        dataOutputStream.write(this.salt);
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
        return sb2.toString();
    }
}

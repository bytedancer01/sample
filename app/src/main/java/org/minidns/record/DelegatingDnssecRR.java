package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import org.minidns.constants.DnssecConstants;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/DelegatingDnssecRR.class */
public abstract class DelegatingDnssecRR extends Data {
    public static final boolean $assertionsDisabled = false;
    public final DnssecConstants.SignatureAlgorithm algorithm;
    public final byte algorithmByte;
    public final byte[] digest;
    private transient BigInteger digestBigIntCache;
    private transient String digestHexCache;
    public final DnssecConstants.DigestAlgorithm digestType;
    public final byte digestTypeByte;
    public final int keyTag;

    /* loaded from: combined.jar:classes3.jar:org/minidns/record/DelegatingDnssecRR$SharedData.class */
    public static final class SharedData {
        public final byte algorithm;
        public final byte[] digest;
        public final byte digestType;
        public final int keyTag;

        private SharedData(int i10, byte b10, byte b11, byte[] bArr) {
            this.keyTag = i10;
            this.algorithm = b10;
            this.digestType = b11;
            this.digest = bArr;
        }
    }

    public DelegatingDnssecRR(int i10, byte b10, byte b11, byte[] bArr) {
        this(i10, null, b10, null, b11, bArr);
    }

    public DelegatingDnssecRR(int i10, DnssecConstants.SignatureAlgorithm signatureAlgorithm, byte b10, DnssecConstants.DigestAlgorithm digestAlgorithm, byte b11, byte[] bArr) {
        this.keyTag = i10;
        this.algorithmByte = b10;
        this.algorithm = signatureAlgorithm == null ? DnssecConstants.SignatureAlgorithm.forByte(b10) : signatureAlgorithm;
        this.digestTypeByte = b11;
        this.digestType = digestAlgorithm == null ? DnssecConstants.DigestAlgorithm.forByte(b11) : digestAlgorithm;
        this.digest = bArr;
    }

    public DelegatingDnssecRR(int i10, DnssecConstants.SignatureAlgorithm signatureAlgorithm, byte b10, byte[] bArr) {
        this(i10, signatureAlgorithm, signatureAlgorithm.number, null, b10, bArr);
    }

    public DelegatingDnssecRR(int i10, DnssecConstants.SignatureAlgorithm signatureAlgorithm, DnssecConstants.DigestAlgorithm digestAlgorithm, byte[] bArr) {
        this(i10, signatureAlgorithm, signatureAlgorithm.number, digestAlgorithm, digestAlgorithm.value, bArr);
    }

    public static SharedData parseSharedData(DataInputStream dataInputStream, int i10) {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        if (dataInputStream.read(bArr) == i11) {
            return new SharedData(readUnsignedShort, readByte, readByte2, bArr);
        }
        throw new IOException();
    }

    public boolean digestEquals(byte[] bArr) {
        return Arrays.equals(this.digest, bArr);
    }

    public BigInteger getDigestBigInteger() {
        if (this.digestBigIntCache == null) {
            this.digestBigIntCache = new BigInteger(1, this.digest);
        }
        return this.digestBigIntCache;
    }

    public String getDigestHex() {
        if (this.digestHexCache == null) {
            this.digestHexCache = getDigestBigInteger().toString(16).toUpperCase();
        }
        return this.digestHexCache;
    }

    @Override // org.minidns.record.Data
    public void serialize(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.keyTag);
        dataOutputStream.writeByte(this.algorithmByte);
        dataOutputStream.writeByte(this.digestTypeByte);
        dataOutputStream.write(this.digest);
    }

    public String toString() {
        return this.keyTag + ' ' + this.algorithm + ' ' + this.digestType + ' ' + new BigInteger(1, this.digest).toString(16).toUpperCase();
    }
}

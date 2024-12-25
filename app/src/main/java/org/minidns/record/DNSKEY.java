package org.minidns.record;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import org.minidns.constants.DnssecConstants;
import org.minidns.record.Record;
import org.minidns.util.Base64;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/DNSKEY.class */
public class DNSKEY extends Data {
    public static final boolean $assertionsDisabled = false;
    public static final short FLAG_REVOKE = 128;
    public static final short FLAG_SECURE_ENTRY_POINT = 1;
    public static final short FLAG_ZONE = 256;
    public static final byte PROTOCOL_RFC4034 = 3;
    public final DnssecConstants.SignatureAlgorithm algorithm;
    public final byte algorithmByte;
    public final short flags;
    private final byte[] key;
    private transient String keyBase64Cache;
    private transient BigInteger keyBigIntegerCache;
    private transient Integer keyTag;
    public final byte protocol;

    public DNSKEY(short s10, byte b10, byte b11, byte[] bArr) {
        this(s10, b10, DnssecConstants.SignatureAlgorithm.forByte(b11), bArr);
    }

    private DNSKEY(short s10, byte b10, DnssecConstants.SignatureAlgorithm signatureAlgorithm, byte b11, byte[] bArr) {
        this.flags = s10;
        this.protocol = b10;
        this.algorithmByte = b11;
        this.algorithm = signatureAlgorithm == null ? DnssecConstants.SignatureAlgorithm.forByte(b11) : signatureAlgorithm;
        this.key = bArr;
    }

    public DNSKEY(short s10, byte b10, DnssecConstants.SignatureAlgorithm signatureAlgorithm, byte[] bArr) {
        this(s10, b10, signatureAlgorithm, signatureAlgorithm.number, bArr);
    }

    public static DNSKEY parse(DataInputStream dataInputStream, int i10) {
        short readShort = dataInputStream.readShort();
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        byte[] bArr = new byte[i10 - 4];
        dataInputStream.readFully(bArr);
        return new DNSKEY(readShort, readByte, readByte2, bArr);
    }

    public byte[] getKey() {
        return (byte[]) this.key.clone();
    }

    public DataInputStream getKeyAsDataInputStream() {
        return new DataInputStream(new ByteArrayInputStream(this.key));
    }

    public String getKeyBase64() {
        if (this.keyBase64Cache == null) {
            this.keyBase64Cache = Base64.encodeToString(this.key);
        }
        return this.keyBase64Cache;
    }

    public BigInteger getKeyBigInteger() {
        if (this.keyBigIntegerCache == null) {
            this.keyBigIntegerCache = new BigInteger(this.key);
        }
        return this.keyBigIntegerCache;
    }

    public int getKeyLength() {
        return this.key.length;
    }

    public int getKeyTag() {
        if (this.keyTag == null) {
            byte[] byteArray = toByteArray();
            long j10 = 0;
            for (int i10 = 0; i10 < byteArray.length; i10++) {
                j10 += (i10 & 1) > 0 ? byteArray[i10] & 255 : (byteArray[i10] & 255) << 8;
            }
            this.keyTag = Integer.valueOf((int) ((j10 + ((j10 >> 16) & 65535)) & 65535));
        }
        return this.keyTag.intValue();
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.DNSKEY;
    }

    public boolean isSecureEntryPoint() {
        boolean z10 = true;
        if ((this.flags & 1) != 1) {
            z10 = false;
        }
        return z10;
    }

    public boolean keyEquals(byte[] bArr) {
        return Arrays.equals(this.key, bArr);
    }

    @Override // org.minidns.record.Data
    public void serialize(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.flags);
        dataOutputStream.writeByte(this.protocol);
        dataOutputStream.writeByte(this.algorithm.number);
        dataOutputStream.write(this.key);
    }

    public String toString() {
        return ((int) this.flags) + ' ' + ((int) this.protocol) + ' ' + this.algorithm + ' ' + Base64.encodeToString(this.key);
    }
}

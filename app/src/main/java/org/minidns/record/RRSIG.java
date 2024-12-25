package org.minidns.record;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.minidns.constants.DnssecConstants;
import org.minidns.dnsname.DnsName;
import org.minidns.record.Record;
import org.minidns.util.Base64;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/RRSIG.class */
public class RRSIG extends Data {
    public static final boolean $assertionsDisabled = false;
    public final DnssecConstants.SignatureAlgorithm algorithm;
    public final byte algorithmByte;
    private transient String base64SignatureCache;
    public final int keyTag;
    public final byte labels;
    public final long originalTtl;
    private final byte[] signature;
    public final Date signatureExpiration;
    public final Date signatureInception;
    public final DnsName signerName;
    public final Record.TYPE typeCovered;

    public RRSIG(Record.TYPE type, int i10, byte b10, long j10, Date date, Date date2, int i11, String str, byte[] bArr) {
        this(type, null, (byte) i10, b10, j10, date, date2, i11, DnsName.from(str), bArr);
    }

    public RRSIG(Record.TYPE type, int i10, byte b10, long j10, Date date, Date date2, int i11, DnsName dnsName, byte[] bArr) {
        this(type, null, (byte) i10, b10, j10, date, date2, i11, dnsName, bArr);
    }

    private RRSIG(Record.TYPE type, DnssecConstants.SignatureAlgorithm signatureAlgorithm, byte b10, byte b11, long j10, Date date, Date date2, int i10, DnsName dnsName, byte[] bArr) {
        this.typeCovered = type;
        this.algorithmByte = b10;
        this.algorithm = signatureAlgorithm == null ? DnssecConstants.SignatureAlgorithm.forByte(b10) : signatureAlgorithm;
        this.labels = b11;
        this.originalTtl = j10;
        this.signatureExpiration = date;
        this.signatureInception = date2;
        this.keyTag = i10;
        this.signerName = dnsName;
        this.signature = bArr;
    }

    public RRSIG(Record.TYPE type, DnssecConstants.SignatureAlgorithm signatureAlgorithm, byte b10, long j10, Date date, Date date2, int i10, String str, byte[] bArr) {
        this(type, signatureAlgorithm.number, b10, j10, date, date2, i10, DnsName.from(str), bArr);
    }

    public RRSIG(Record.TYPE type, DnssecConstants.SignatureAlgorithm signatureAlgorithm, byte b10, long j10, Date date, Date date2, int i10, DnsName dnsName, byte[] bArr) {
        this(type, signatureAlgorithm.number, b10, j10, date, date2, i10, dnsName, bArr);
    }

    public static RRSIG parse(DataInputStream dataInputStream, byte[] bArr, int i10) {
        Record.TYPE type = Record.TYPE.getType(dataInputStream.readUnsignedShort());
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        long readInt = dataInputStream.readInt();
        Date date = new Date((dataInputStream.readInt() & 4294967295L) * 1000);
        Date date2 = new Date((4294967295L & dataInputStream.readInt()) * 1000);
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        DnsName parse = DnsName.parse(dataInputStream, bArr);
        int size = (i10 - parse.size()) - 18;
        byte[] bArr2 = new byte[size];
        if (dataInputStream.read(bArr2) == size) {
            return new RRSIG(type, null, readByte, readByte2, readInt & 4294967295L, date, date2, readUnsignedShort, parse, bArr2);
        }
        throw new IOException();
    }

    public byte[] getSignature() {
        return (byte[]) this.signature.clone();
    }

    public DataInputStream getSignatureAsDataInputStream() {
        return new DataInputStream(new ByteArrayInputStream(this.signature));
    }

    public String getSignatureBase64() {
        if (this.base64SignatureCache == null) {
            this.base64SignatureCache = Base64.encodeToString(this.signature);
        }
        return this.base64SignatureCache;
    }

    public int getSignatureLength() {
        return this.signature.length;
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.RRSIG;
    }

    @Override // org.minidns.record.Data
    public void serialize(DataOutputStream dataOutputStream) {
        writePartialSignature(dataOutputStream);
        dataOutputStream.write(this.signature);
    }

    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return this.typeCovered + ' ' + this.algorithm + ' ' + ((int) this.labels) + ' ' + this.originalTtl + ' ' + simpleDateFormat.format(this.signatureExpiration) + ' ' + simpleDateFormat.format(this.signatureInception) + ' ' + this.keyTag + ' ' + ((CharSequence) this.signerName) + ". " + getSignatureBase64();
    }

    public void writePartialSignature(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.typeCovered.getValue());
        dataOutputStream.writeByte(this.algorithmByte);
        dataOutputStream.writeByte(this.labels);
        dataOutputStream.writeInt((int) this.originalTtl);
        dataOutputStream.writeInt((int) (this.signatureExpiration.getTime() / 1000));
        dataOutputStream.writeInt((int) (this.signatureInception.getTime() / 1000));
        dataOutputStream.writeShort(this.keyTag);
        this.signerName.writeToStream(dataOutputStream);
    }
}

package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/TLSA.class */
public class TLSA extends Data {
    public final CertUsage certUsage;
    public final byte certUsageByte;
    private final byte[] certificateAssociation;
    public final MatchingType matchingType;
    public final byte matchingTypeByte;
    public final Selector selector;
    public final byte selectorByte;
    private static final Map<Byte, CertUsage> CERT_USAGE_LUT = new HashMap();
    private static final Map<Byte, Selector> SELECTOR_LUT = new HashMap();
    private static final Map<Byte, MatchingType> MATCHING_TYPE_LUT = new HashMap();

    /* loaded from: combined.jar:classes3.jar:org/minidns/record/TLSA$CertUsage.class */
    public enum CertUsage {
        caConstraint((byte) 0),
        serviceCertificateConstraint((byte) 1),
        trustAnchorAssertion((byte) 2),
        domainIssuedCertificate((byte) 3);

        public final byte byteValue;

        CertUsage(byte b10) {
            this.byteValue = b10;
            TLSA.CERT_USAGE_LUT.put(Byte.valueOf(b10), this);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/minidns/record/TLSA$MatchingType.class */
    public enum MatchingType {
        noHash((byte) 0),
        sha256((byte) 1),
        sha512((byte) 2);

        public final byte byteValue;

        MatchingType(byte b10) {
            this.byteValue = b10;
            TLSA.MATCHING_TYPE_LUT.put(Byte.valueOf(b10), this);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/minidns/record/TLSA$Selector.class */
    public enum Selector {
        fullCertificate((byte) 0),
        subjectPublicKeyInfo((byte) 1);

        public final byte byteValue;

        Selector(byte b10) {
            this.byteValue = b10;
            TLSA.SELECTOR_LUT.put(Byte.valueOf(b10), this);
        }
    }

    static {
        CertUsage.values();
        Selector.values();
        MatchingType.values();
    }

    public TLSA(byte b10, byte b11, byte b12, byte[] bArr) {
        this.certUsageByte = b10;
        this.certUsage = CERT_USAGE_LUT.get(Byte.valueOf(b10));
        this.selectorByte = b11;
        this.selector = SELECTOR_LUT.get(Byte.valueOf(b11));
        this.matchingTypeByte = b12;
        this.matchingType = MATCHING_TYPE_LUT.get(Byte.valueOf(b12));
        this.certificateAssociation = bArr;
    }

    public static TLSA parse(DataInputStream dataInputStream, int i10) {
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        byte readByte3 = dataInputStream.readByte();
        int i11 = i10 - 3;
        byte[] bArr = new byte[i11];
        if (dataInputStream.read(bArr) == i11) {
            return new TLSA(readByte, readByte2, readByte3, bArr);
        }
        throw new IOException();
    }

    public boolean certificateAssociationEquals(byte[] bArr) {
        return Arrays.equals(this.certificateAssociation, bArr);
    }

    public byte[] getCertificateAssociation() {
        return (byte[]) this.certificateAssociation.clone();
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.TLSA;
    }

    @Override // org.minidns.record.Data
    public void serialize(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.certUsageByte);
        dataOutputStream.writeByte(this.selectorByte);
        dataOutputStream.writeByte(this.matchingTypeByte);
        dataOutputStream.write(this.certificateAssociation);
    }

    public String toString() {
        return ((int) this.certUsageByte) + ' ' + ((int) this.selectorByte) + ' ' + ((int) this.matchingTypeByte) + ' ' + new BigInteger(1, this.certificateAssociation).toString(16);
    }
}

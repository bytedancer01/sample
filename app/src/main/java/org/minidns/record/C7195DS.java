package org.minidns.record;

import java.io.DataInputStream;
import org.minidns.constants.DnssecConstants;
import org.minidns.record.DelegatingDnssecRR;
import org.minidns.record.Record;

/* renamed from: org.minidns.record.DS */
/* loaded from: combined.jar:classes3.jar:org/minidns/record/DS.class */
public class C7195DS extends DelegatingDnssecRR {
    public C7195DS(int i10, byte b10, byte b11, byte[] bArr) {
        super(i10, b10, b11, bArr);
    }

    public C7195DS(int i10, DnssecConstants.SignatureAlgorithm signatureAlgorithm, byte b10, byte[] bArr) {
        super(i10, signatureAlgorithm, b10, bArr);
    }

    public C7195DS(int i10, DnssecConstants.SignatureAlgorithm signatureAlgorithm, DnssecConstants.DigestAlgorithm digestAlgorithm, byte[] bArr) {
        super(i10, signatureAlgorithm, digestAlgorithm, bArr);
    }

    public static C7195DS parse(DataInputStream dataInputStream, int i10) {
        DelegatingDnssecRR.SharedData parseSharedData = DelegatingDnssecRR.parseSharedData(dataInputStream, i10);
        return new C7195DS(parseSharedData.keyTag, parseSharedData.algorithm, parseSharedData.digestType, parseSharedData.digest);
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.DS;
    }
}

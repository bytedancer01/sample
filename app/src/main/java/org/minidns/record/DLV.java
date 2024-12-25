package org.minidns.record;

import java.io.DataInputStream;
import org.minidns.constants.DnssecConstants;
import org.minidns.record.DelegatingDnssecRR;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/DLV.class */
public class DLV extends DelegatingDnssecRR {
    public DLV(int i10, byte b10, byte b11, byte[] bArr) {
        super(i10, b10, b11, bArr);
    }

    public DLV(int i10, DnssecConstants.SignatureAlgorithm signatureAlgorithm, DnssecConstants.DigestAlgorithm digestAlgorithm, byte[] bArr) {
        super(i10, signatureAlgorithm, digestAlgorithm, bArr);
    }

    public static DLV parse(DataInputStream dataInputStream, int i10) {
        DelegatingDnssecRR.SharedData parseSharedData = DelegatingDnssecRR.parseSharedData(dataInputStream, i10);
        return new DLV(parseSharedData.keyTag, parseSharedData.algorithm, parseSharedData.digestType, parseSharedData.digest);
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.DLV;
    }
}

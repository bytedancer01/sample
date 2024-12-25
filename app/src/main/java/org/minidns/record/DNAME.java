package org.minidns.record;

import java.io.DataInputStream;
import org.minidns.dnsname.DnsName;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/DNAME.class */
public class DNAME extends RRWithTarget {
    public DNAME(String str) {
        this(DnsName.from(str));
    }

    public DNAME(DnsName dnsName) {
        super(dnsName);
    }

    public static DNAME parse(DataInputStream dataInputStream, byte[] bArr) {
        return new DNAME(DnsName.parse(dataInputStream, bArr));
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.DNAME;
    }
}

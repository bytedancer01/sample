package org.minidns.record;

import java.io.DataInputStream;
import org.minidns.dnsname.DnsName;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/CNAME.class */
public class CNAME extends RRWithTarget {
    public CNAME(String str) {
        this(DnsName.from(str));
    }

    public CNAME(DnsName dnsName) {
        super(dnsName);
    }

    public static CNAME parse(DataInputStream dataInputStream, byte[] bArr) {
        return new CNAME(DnsName.parse(dataInputStream, bArr));
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.CNAME;
    }
}

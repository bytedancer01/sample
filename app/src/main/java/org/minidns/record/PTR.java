package org.minidns.record;

import java.io.DataInputStream;
import org.minidns.dnsname.DnsName;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/PTR.class */
public class PTR extends RRWithTarget {
    public PTR(String str) {
        this(DnsName.from(str));
    }

    public PTR(DnsName dnsName) {
        super(dnsName);
    }

    public static PTR parse(DataInputStream dataInputStream, byte[] bArr) {
        return new PTR(DnsName.parse(dataInputStream, bArr));
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.PTR;
    }
}

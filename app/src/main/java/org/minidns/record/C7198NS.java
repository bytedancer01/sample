package org.minidns.record;

import java.io.DataInputStream;
import org.minidns.dnsname.DnsName;
import org.minidns.record.Record;

/* renamed from: org.minidns.record.NS */
/* loaded from: combined.jar:classes3.jar:org/minidns/record/NS.class */
public class C7198NS extends RRWithTarget {
    public C7198NS(DnsName dnsName) {
        super(dnsName);
    }

    public static C7198NS parse(DataInputStream dataInputStream, byte[] bArr) {
        return new C7198NS(DnsName.parse(dataInputStream, bArr));
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.NS;
    }
}

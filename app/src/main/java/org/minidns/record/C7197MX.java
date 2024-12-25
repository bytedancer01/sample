package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import org.minidns.dnsname.DnsName;
import org.minidns.record.Record;

/* renamed from: org.minidns.record.MX */
/* loaded from: combined.jar:classes3.jar:org/minidns/record/MX.class */
public class C7197MX extends Data {

    @Deprecated
    public final DnsName name;
    public final int priority;
    public final DnsName target;

    public C7197MX(int i10, String str) {
        this(i10, DnsName.from(str));
    }

    public C7197MX(int i10, DnsName dnsName) {
        this.priority = i10;
        this.target = dnsName;
        this.name = dnsName;
    }

    public static C7197MX parse(DataInputStream dataInputStream, byte[] bArr) {
        return new C7197MX(dataInputStream.readUnsignedShort(), DnsName.parse(dataInputStream, bArr));
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.MX;
    }

    @Override // org.minidns.record.Data
    public void serialize(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.priority);
        this.target.writeToStream(dataOutputStream);
    }

    public String toString() {
        return this.priority + " " + ((Object) this.target) + '.';
    }
}

package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import org.minidns.dnsname.DnsName;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/SOA.class */
public class SOA extends Data {
    public final int expire;
    public final long minimum;
    public final DnsName mname;
    public final int refresh;
    public final int retry;
    public final DnsName rname;
    public final long serial;

    public SOA(String str, String str2, long j10, int i10, int i11, int i12, long j11) {
        this(DnsName.from(str), DnsName.from(str2), j10, i10, i11, i12, j11);
    }

    public SOA(DnsName dnsName, DnsName dnsName2, long j10, int i10, int i11, int i12, long j11) {
        this.mname = dnsName;
        this.rname = dnsName2;
        this.serial = j10;
        this.refresh = i10;
        this.retry = i11;
        this.expire = i12;
        this.minimum = j11;
    }

    public static SOA parse(DataInputStream dataInputStream, byte[] bArr) {
        return new SOA(DnsName.parse(dataInputStream, bArr), DnsName.parse(dataInputStream, bArr), dataInputStream.readInt() & 4294967295L, dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt() & 4294967295L);
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.SOA;
    }

    @Override // org.minidns.record.Data
    public void serialize(DataOutputStream dataOutputStream) {
        this.mname.writeToStream(dataOutputStream);
        this.rname.writeToStream(dataOutputStream);
        dataOutputStream.writeInt((int) this.serial);
        dataOutputStream.writeInt(this.refresh);
        dataOutputStream.writeInt(this.retry);
        dataOutputStream.writeInt(this.expire);
        dataOutputStream.writeInt((int) this.minimum);
    }

    public String toString() {
        return ((CharSequence) this.mname) + ". " + ((CharSequence) this.rname) + ". " + this.serial + ' ' + this.refresh + ' ' + this.retry + ' ' + this.expire + ' ' + this.minimum;
    }
}

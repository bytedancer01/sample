package org.minidns.record;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import org.minidns.dnsname.DnsName;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/SRV.class */
public class SRV extends Data implements Comparable<SRV> {

    @Deprecated
    public final DnsName name;
    public final int port;
    public final int priority;
    public final DnsName target;
    public final int weight;

    public SRV(int i10, int i11, int i12, String str) {
        this(i10, i11, i12, DnsName.from(str));
    }

    public SRV(int i10, int i11, int i12, DnsName dnsName) {
        this.priority = i10;
        this.weight = i11;
        this.port = i12;
        this.target = dnsName;
        this.name = dnsName;
    }

    public static SRV parse(DataInputStream dataInputStream, byte[] bArr) {
        return new SRV(dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), DnsName.parse(dataInputStream, bArr));
    }

    @Override // java.lang.Comparable
    public int compareTo(SRV srv) {
        int i10 = srv.priority - this.priority;
        int i11 = i10;
        if (i10 == 0) {
            i11 = this.weight - srv.weight;
        }
        return i11;
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.SRV;
    }

    public boolean isServiceAvailable() {
        return !this.target.isRootLabel();
    }

    @Override // org.minidns.record.Data
    public void serialize(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.priority);
        dataOutputStream.writeShort(this.weight);
        dataOutputStream.writeShort(this.port);
        this.target.writeToStream(dataOutputStream);
    }

    public String toString() {
        return this.priority + " " + this.weight + " " + this.port + " " + ((Object) this.target) + InstructionFileId.DOT;
    }
}

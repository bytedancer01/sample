package org.minidns.record;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.io.DataOutputStream;
import org.minidns.dnsname.DnsName;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/RRWithTarget.class */
public abstract class RRWithTarget extends Data {

    @Deprecated
    public final DnsName name;
    public final DnsName target;

    public RRWithTarget(DnsName dnsName) {
        this.target = dnsName;
        this.name = dnsName;
    }

    public final DnsName getTarget() {
        return this.target;
    }

    @Override // org.minidns.record.Data
    public void serialize(DataOutputStream dataOutputStream) {
        this.target.writeToStream(dataOutputStream);
    }

    public String toString() {
        return ((Object) this.target) + InstructionFileId.DOT;
    }
}

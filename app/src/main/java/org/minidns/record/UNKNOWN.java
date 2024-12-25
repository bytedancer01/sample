package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/UNKNOWN.class */
public final class UNKNOWN extends Data {
    private final byte[] data;
    private final Record.TYPE type;

    private UNKNOWN(DataInputStream dataInputStream, int i10, Record.TYPE type) {
        this.type = type;
        byte[] bArr = new byte[i10];
        this.data = bArr;
        dataInputStream.readFully(bArr);
    }

    public static UNKNOWN parse(DataInputStream dataInputStream, int i10, Record.TYPE type) {
        return new UNKNOWN(dataInputStream, i10, type);
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return this.type;
    }

    @Override // org.minidns.record.Data
    public void serialize(DataOutputStream dataOutputStream) {
        dataOutputStream.write(this.data);
    }
}

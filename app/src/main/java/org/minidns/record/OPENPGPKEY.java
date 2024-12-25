package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import org.minidns.record.Record;
import org.minidns.util.Base64;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/OPENPGPKEY.class */
public class OPENPGPKEY extends Data {
    private final byte[] publicKeyPacket;
    private transient String publicKeyPacketBase64Cache;

    public OPENPGPKEY(byte[] bArr) {
        this.publicKeyPacket = bArr;
    }

    public static OPENPGPKEY parse(DataInputStream dataInputStream, int i10) {
        byte[] bArr = new byte[i10];
        dataInputStream.readFully(bArr);
        return new OPENPGPKEY(bArr);
    }

    public byte[] getPublicKeyPacket() {
        return (byte[]) this.publicKeyPacket.clone();
    }

    public String getPublicKeyPacketBase64() {
        if (this.publicKeyPacketBase64Cache == null) {
            this.publicKeyPacketBase64Cache = Base64.encodeToString(this.publicKeyPacket);
        }
        return this.publicKeyPacketBase64Cache;
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.OPENPGPKEY;
    }

    @Override // org.minidns.record.Data
    public void serialize(DataOutputStream dataOutputStream) {
        dataOutputStream.write(this.publicKeyPacket);
    }

    public String toString() {
        return getPublicKeyPacketBase64();
    }
}

package org.minidns.record;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.io.DataInputStream;
import java.net.Inet4Address;
import org.minidns.record.Record;
import org.minidns.util.InetAddressUtil;

/* renamed from: org.minidns.record.A */
/* loaded from: combined.jar:classes3.jar:org/minidns/record/A.class */
public class C7194A extends InternetAddressRR<Inet4Address> {
    public static final boolean $assertionsDisabled = false;

    public C7194A(int i10, int i11, int i12, int i13) {
        super(new byte[]{(byte) i10, (byte) i11, (byte) i12, (byte) i13});
        if (i10 < 0 || i10 > 255 || i11 < 0 || i11 > 255 || i12 < 0 || i12 > 255 || i13 < 0 || i13 > 255) {
            throw new IllegalArgumentException();
        }
    }

    public C7194A(CharSequence charSequence) {
        this(InetAddressUtil.ipv4From(charSequence));
    }

    public C7194A(Inet4Address inet4Address) {
        super(inet4Address);
    }

    public C7194A(byte[] bArr) {
        super(bArr);
        if (bArr.length != 4) {
            throw new IllegalArgumentException("IPv4 address in A record is always 4 byte");
        }
    }

    public static C7194A parse(DataInputStream dataInputStream) {
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        return new C7194A(bArr);
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.A;
    }

    public String toString() {
        return Integer.toString(this.f36214ip[0] & 255) + InstructionFileId.DOT + Integer.toString(this.f36214ip[1] & 255) + InstructionFileId.DOT + Integer.toString(this.f36214ip[2] & 255) + InstructionFileId.DOT + Integer.toString(this.f36214ip[3] & 255);
    }
}

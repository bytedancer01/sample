package org.minidns.record;

import java.io.DataInputStream;
import java.net.Inet6Address;
import org.minidns.record.Record;
import org.minidns.util.InetAddressUtil;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/AAAA.class */
public class AAAA extends InternetAddressRR<Inet6Address> {
    public static final boolean $assertionsDisabled = false;

    public AAAA(CharSequence charSequence) {
        this(InetAddressUtil.ipv6From(charSequence));
    }

    public AAAA(Inet6Address inet6Address) {
        super(inet6Address);
    }

    public AAAA(byte[] bArr) {
        super(bArr);
        if (bArr.length != 16) {
            throw new IllegalArgumentException("IPv6 address in AAAA record is always 16 byte");
        }
    }

    public static AAAA parse(DataInputStream dataInputStream) {
        byte[] bArr = new byte[16];
        dataInputStream.readFully(bArr);
        return new AAAA(bArr);
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.AAAA;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f36214ip.length; i10 += 2) {
            if (i10 != 0) {
                sb2.append(':');
            }
            byte[] bArr = this.f36214ip;
            sb2.append(Integer.toHexString(((bArr[i10] & 255) << 8) + (bArr[i10 + 1] & 255)));
        }
        return sb2.toString();
    }
}

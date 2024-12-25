package org.minidns.record;

import java.io.DataOutputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/InternetAddressRR.class */
public abstract class InternetAddressRR<IA extends InetAddress> extends Data {
    private transient IA inetAddress;

    /* renamed from: ip */
    public final byte[] f36214ip;

    public InternetAddressRR(IA ia2) {
        this(ia2.getAddress());
        this.inetAddress = ia2;
    }

    public InternetAddressRR(byte[] bArr) {
        this.f36214ip = bArr;
    }

    public static InternetAddressRR<? extends InetAddress> from(InetAddress inetAddress) {
        return inetAddress instanceof Inet4Address ? new C7194A((Inet4Address) inetAddress) : new AAAA((Inet6Address) inetAddress);
    }

    public final IA getInetAddress() {
        if (this.inetAddress == null) {
            try {
                this.inetAddress = (IA) InetAddress.getByAddress(this.f36214ip);
            } catch (UnknownHostException e10) {
                throw new IllegalStateException(e10);
            }
        }
        return this.inetAddress;
    }

    public final byte[] getIp() {
        return (byte[]) this.f36214ip.clone();
    }

    @Override // org.minidns.record.Data
    public final void serialize(DataOutputStream dataOutputStream) {
        dataOutputStream.write(this.f36214ip);
    }
}

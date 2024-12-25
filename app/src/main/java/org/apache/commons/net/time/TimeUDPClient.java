package org.apache.commons.net.time;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Date;
import org.apache.commons.net.DatagramSocketClient;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/time/TimeUDPClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/time/TimeUDPClient.class */
public final class TimeUDPClient extends DatagramSocketClient {
    public static final int DEFAULT_PORT = 37;
    public static final long SECONDS_1900_TO_1970 = 2208988800L;
    private final byte[] __dummyData = new byte[1];
    private final byte[] __timeData = new byte[4];

    public Date getDate(InetAddress inetAddress) {
        return new Date((getTime(inetAddress, 37) - 2208988800L) * 1000);
    }

    public Date getDate(InetAddress inetAddress, int i10) {
        return new Date((getTime(inetAddress, i10) - 2208988800L) * 1000);
    }

    public long getTime(InetAddress inetAddress) {
        return getTime(inetAddress, 37);
    }

    public long getTime(InetAddress inetAddress, int i10) {
        byte[] bArr = this.__dummyData;
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, inetAddress, i10);
        byte[] bArr2 = this.__timeData;
        DatagramPacket datagramPacket2 = new DatagramPacket(bArr2, bArr2.length);
        this._socket_.send(datagramPacket);
        this._socket_.receive(datagramPacket2);
        byte[] bArr3 = this.__timeData;
        return (bArr3[3] & 255 & 4294967295L) | (((bArr3[0] & 255) << 24) & 4294967295L) | 0 | (((bArr3[1] & 255) << 16) & 4294967295L) | (((bArr3[2] & 255) << 8) & 4294967295L);
    }
}

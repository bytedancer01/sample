package org.apache.commons.net.daytime;

import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.DatagramSocketClient;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/daytime/DaytimeUDPClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/daytime/DaytimeUDPClient.class */
public final class DaytimeUDPClient extends DatagramSocketClient {
    public static final int DEFAULT_PORT = 13;
    private final byte[] __dummyData = new byte[1];
    private final byte[] __timeData = new byte[256];

    public String getTime(InetAddress inetAddress) {
        return getTime(inetAddress, 13);
    }

    public String getTime(InetAddress inetAddress, int i10) {
        byte[] bArr = this.__dummyData;
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, inetAddress, i10);
        byte[] bArr2 = this.__timeData;
        DatagramPacket datagramPacket2 = new DatagramPacket(bArr2, bArr2.length);
        this._socket_.send(datagramPacket);
        this._socket_.receive(datagramPacket2);
        return new String(datagramPacket2.getData(), 0, datagramPacket2.getLength(), getCharsetName());
    }
}

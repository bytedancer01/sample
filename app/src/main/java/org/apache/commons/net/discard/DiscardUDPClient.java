package org.apache.commons.net.discard;

import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.DatagramSocketClient;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/discard/DiscardUDPClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/discard/DiscardUDPClient.class */
public class DiscardUDPClient extends DatagramSocketClient {
    public static final int DEFAULT_PORT = 9;
    public DatagramPacket _sendPacket = new DatagramPacket(new byte[0], 0);

    public void send(byte[] bArr, int i10, InetAddress inetAddress) {
        send(bArr, i10, inetAddress, 9);
    }

    public void send(byte[] bArr, int i10, InetAddress inetAddress, int i11) {
        this._sendPacket.setData(bArr);
        this._sendPacket.setLength(i10);
        this._sendPacket.setAddress(inetAddress);
        this._sendPacket.setPort(i11);
        this._socket_.send(this._sendPacket);
    }

    public void send(byte[] bArr, InetAddress inetAddress) {
        send(bArr, bArr.length, inetAddress, 9);
    }
}

package org.apache.commons.net.echo;

import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.discard.DiscardUDPClient;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/echo/EchoUDPClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/echo/EchoUDPClient.class */
public final class EchoUDPClient extends DiscardUDPClient {
    public static final int DEFAULT_PORT = 7;
    private final DatagramPacket __receivePacket = new DatagramPacket(new byte[0], 0);

    public int receive(byte[] bArr) {
        return receive(bArr, bArr.length);
    }

    public int receive(byte[] bArr, int i10) {
        this.__receivePacket.setData(bArr);
        this.__receivePacket.setLength(i10);
        this._socket_.receive(this.__receivePacket);
        return this.__receivePacket.getLength();
    }

    @Override // org.apache.commons.net.discard.DiscardUDPClient
    public void send(byte[] bArr, int i10, InetAddress inetAddress) {
        send(bArr, i10, inetAddress, 7);
    }

    @Override // org.apache.commons.net.discard.DiscardUDPClient
    public void send(byte[] bArr, InetAddress inetAddress) {
        send(bArr, bArr.length, inetAddress, 7);
    }
}

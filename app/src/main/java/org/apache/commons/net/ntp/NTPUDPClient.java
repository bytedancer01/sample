package org.apache.commons.net.ntp;

import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.DatagramSocketClient;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ntp/NTPUDPClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ntp/NTPUDPClient.class */
public final class NTPUDPClient extends DatagramSocketClient {
    public static final int DEFAULT_PORT = 123;
    private int _version = 3;

    public TimeInfo getTime(InetAddress inetAddress) {
        return getTime(inetAddress, 123);
    }

    public TimeInfo getTime(InetAddress inetAddress, int i10) {
        if (!isOpen()) {
            open();
        }
        NtpV3Impl ntpV3Impl = new NtpV3Impl();
        ntpV3Impl.setMode(3);
        ntpV3Impl.setVersion(this._version);
        DatagramPacket datagramPacket = ntpV3Impl.getDatagramPacket();
        datagramPacket.setAddress(inetAddress);
        datagramPacket.setPort(i10);
        NtpV3Impl ntpV3Impl2 = new NtpV3Impl();
        DatagramPacket datagramPacket2 = ntpV3Impl2.getDatagramPacket();
        ntpV3Impl.setTransmitTime(TimeStamp.getCurrentTime());
        this._socket_.send(datagramPacket);
        this._socket_.receive(datagramPacket2);
        return new TimeInfo((NtpV3Packet) ntpV3Impl2, System.currentTimeMillis(), false);
    }

    public int getVersion() {
        return this._version;
    }

    public void setVersion(int i10) {
        this._version = i10;
    }
}

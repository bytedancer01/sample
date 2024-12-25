package org.apache.commons.net.tftp;

import java.net.DatagramPacket;
import java.net.InetAddress;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/tftp/TFTPPacket.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/tftp/TFTPPacket.class */
public abstract class TFTPPacket {
    public static final int ACKNOWLEDGEMENT = 4;
    public static final int DATA = 3;
    public static final int ERROR = 5;
    public static final int MIN_PACKET_SIZE = 4;
    public static final int READ_REQUEST = 1;
    public static final int SEGMENT_SIZE = 512;
    public static final int WRITE_REQUEST = 2;
    public InetAddress _address;
    public int _port;
    public int _type;

    public TFTPPacket(int i10, InetAddress inetAddress, int i11) {
        this._type = i10;
        this._address = inetAddress;
        this._port = i11;
    }

    public static final TFTPPacket newTFTPPacket(DatagramPacket datagramPacket) {
        TFTPPacket tFTPReadRequestPacket;
        if (datagramPacket.getLength() < 4) {
            throw new TFTPPacketException("Bad packet. Datagram data length is too short.");
        }
        byte b10 = datagramPacket.getData()[1];
        if (b10 == 1) {
            tFTPReadRequestPacket = new TFTPReadRequestPacket(datagramPacket);
        } else if (b10 == 2) {
            tFTPReadRequestPacket = new TFTPWriteRequestPacket(datagramPacket);
        } else if (b10 == 3) {
            tFTPReadRequestPacket = new TFTPDataPacket(datagramPacket);
        } else if (b10 == 4) {
            tFTPReadRequestPacket = new TFTPAckPacket(datagramPacket);
        } else {
            if (b10 != 5) {
                throw new TFTPPacketException("Bad packet.  Invalid TFTP operator code.");
            }
            tFTPReadRequestPacket = new TFTPErrorPacket(datagramPacket);
        }
        return tFTPReadRequestPacket;
    }

    public abstract DatagramPacket _newDatagram(DatagramPacket datagramPacket, byte[] bArr);

    public final InetAddress getAddress() {
        return this._address;
    }

    public final int getPort() {
        return this._port;
    }

    public final int getType() {
        return this._type;
    }

    public abstract DatagramPacket newDatagram();

    public final void setAddress(InetAddress inetAddress) {
        this._address = inetAddress;
    }

    public final void setPort(int i10) {
        this._port = i10;
    }

    public String toString() {
        return this._address + " " + this._port + " " + this._type;
    }
}

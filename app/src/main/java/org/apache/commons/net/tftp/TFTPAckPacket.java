package org.apache.commons.net.tftp;

import java.net.DatagramPacket;
import java.net.InetAddress;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/tftp/TFTPAckPacket.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/tftp/TFTPAckPacket.class */
public final class TFTPAckPacket extends TFTPPacket {
    public int _blockNumber;

    public TFTPAckPacket(DatagramPacket datagramPacket) {
        super(4, datagramPacket.getAddress(), datagramPacket.getPort());
        byte[] data = datagramPacket.getData();
        if (getType() != data[1]) {
            throw new TFTPPacketException("TFTP operator code does not match type.");
        }
        this._blockNumber = (data[3] & 255) | ((data[2] & 255) << 8);
    }

    public TFTPAckPacket(InetAddress inetAddress, int i10, int i11) {
        super(4, inetAddress, i10);
        this._blockNumber = i11;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public DatagramPacket _newDatagram(DatagramPacket datagramPacket, byte[] bArr) {
        bArr[0] = 0;
        bArr[1] = (byte) this._type;
        int i10 = this._blockNumber;
        bArr[2] = (byte) ((65535 & i10) >> 8);
        bArr[3] = (byte) (i10 & 255);
        datagramPacket.setAddress(this._address);
        datagramPacket.setPort(this._port);
        datagramPacket.setData(bArr);
        datagramPacket.setLength(4);
        return datagramPacket;
    }

    public int getBlockNumber() {
        return this._blockNumber;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public DatagramPacket newDatagram() {
        byte b10 = (byte) this._type;
        int i10 = this._blockNumber;
        return new DatagramPacket(new byte[]{0, b10, (byte) ((65535 & i10) >> 8), (byte) (i10 & 255)}, 4, this._address, this._port);
    }

    public void setBlockNumber(int i10) {
        this._blockNumber = i10;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public String toString() {
        return super.toString() + " ACK " + this._blockNumber;
    }
}

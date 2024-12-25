package org.apache.commons.net.tftp;

import java.net.DatagramPacket;
import java.net.InetAddress;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/tftp/TFTPDataPacket.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/tftp/TFTPDataPacket.class */
public final class TFTPDataPacket extends TFTPPacket {
    public static final int MAX_DATA_LENGTH = 512;
    public static final int MIN_DATA_LENGTH = 0;
    public int _blockNumber;
    public byte[] _data;
    public int _length;
    public int _offset;

    public TFTPDataPacket(DatagramPacket datagramPacket) {
        super(3, datagramPacket.getAddress(), datagramPacket.getPort());
        this._data = datagramPacket.getData();
        this._offset = 4;
        int type = getType();
        byte[] bArr = this._data;
        if (type != bArr[1]) {
            throw new TFTPPacketException("TFTP operator code does not match type.");
        }
        this._blockNumber = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int length = datagramPacket.getLength() - 4;
        this._length = length;
        if (length > 512) {
            this._length = 512;
        }
    }

    public TFTPDataPacket(InetAddress inetAddress, int i10, int i11, byte[] bArr) {
        this(inetAddress, i10, i11, bArr, 0, bArr.length);
    }

    public TFTPDataPacket(InetAddress inetAddress, int i10, int i11, byte[] bArr, int i12, int i13) {
        super(3, inetAddress, i10);
        this._blockNumber = i11;
        this._data = bArr;
        this._offset = i12;
        if (i13 > 512) {
            this._length = 512;
        } else {
            this._length = i13;
        }
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public DatagramPacket _newDatagram(DatagramPacket datagramPacket, byte[] bArr) {
        bArr[0] = 0;
        bArr[1] = (byte) this._type;
        int i10 = this._blockNumber;
        bArr[2] = (byte) ((65535 & i10) >> 8);
        bArr[3] = (byte) (i10 & 255);
        byte[] bArr2 = this._data;
        if (bArr != bArr2) {
            System.arraycopy(bArr2, this._offset, bArr, 4, this._length);
        }
        datagramPacket.setAddress(this._address);
        datagramPacket.setPort(this._port);
        datagramPacket.setData(bArr);
        datagramPacket.setLength(this._length + 4);
        return datagramPacket;
    }

    public int getBlockNumber() {
        return this._blockNumber;
    }

    public byte[] getData() {
        return this._data;
    }

    public int getDataLength() {
        return this._length;
    }

    public int getDataOffset() {
        return this._offset;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public DatagramPacket newDatagram() {
        int i10 = this._length;
        byte[] bArr = new byte[i10 + 4];
        bArr[0] = 0;
        bArr[1] = (byte) this._type;
        int i11 = this._blockNumber;
        bArr[2] = (byte) ((65535 & i11) >> 8);
        bArr[3] = (byte) (i11 & 255);
        System.arraycopy(this._data, this._offset, bArr, 4, i10);
        return new DatagramPacket(bArr, this._length + 4, this._address, this._port);
    }

    public void setBlockNumber(int i10) {
        this._blockNumber = i10;
    }

    public void setData(byte[] bArr, int i10, int i11) {
        this._data = bArr;
        this._offset = i10;
        this._length = i11;
        if (i11 > 512) {
            this._length = 512;
        } else {
            this._length = i11;
        }
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public String toString() {
        return super.toString() + " DATA " + this._blockNumber + " " + this._length;
    }
}

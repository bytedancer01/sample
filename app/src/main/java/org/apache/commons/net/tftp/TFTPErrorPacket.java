package org.apache.commons.net.tftp;

import java.net.DatagramPacket;
import java.net.InetAddress;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/tftp/TFTPErrorPacket.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/tftp/TFTPErrorPacket.class */
public final class TFTPErrorPacket extends TFTPPacket {
    public static final int ACCESS_VIOLATION = 2;
    public static final int FILE_EXISTS = 6;
    public static final int FILE_NOT_FOUND = 1;
    public static final int ILLEGAL_OPERATION = 4;
    public static final int NO_SUCH_USER = 7;
    public static final int OUT_OF_SPACE = 3;
    public static final int UNDEFINED = 0;
    public static final int UNKNOWN_TID = 5;
    public int _error;
    public String _message;

    public TFTPErrorPacket(DatagramPacket datagramPacket) {
        super(5, datagramPacket.getAddress(), datagramPacket.getPort());
        byte b10;
        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        if (getType() != data[1]) {
            throw new TFTPPacketException("TFTP operator code does not match type.");
        }
        this._error = ((data[2] & 255) << 8) | (data[3] & 255);
        if (length < 5) {
            throw new TFTPPacketException("Bad error packet. No message.");
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 4; i10 < length && (b10 = data[i10]) != 0; i10++) {
            sb2.append((char) b10);
        }
        this._message = sb2.toString();
    }

    public TFTPErrorPacket(InetAddress inetAddress, int i10, int i11, String str) {
        super(5, inetAddress, i10);
        this._error = i11;
        this._message = str;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public DatagramPacket _newDatagram(DatagramPacket datagramPacket, byte[] bArr) {
        int length = this._message.length();
        bArr[0] = 0;
        bArr[1] = (byte) this._type;
        int i10 = this._error;
        bArr[2] = (byte) ((65535 & i10) >> 8);
        bArr[3] = (byte) (i10 & 255);
        System.arraycopy(this._message.getBytes(), 0, bArr, 4, length);
        int i11 = length + 4;
        bArr[i11] = 0;
        datagramPacket.setAddress(this._address);
        datagramPacket.setPort(this._port);
        datagramPacket.setData(bArr);
        datagramPacket.setLength(i11);
        return datagramPacket;
    }

    public int getError() {
        return this._error;
    }

    public String getMessage() {
        return this._message;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public DatagramPacket newDatagram() {
        int length = this._message.length();
        int i10 = length + 5;
        byte[] bArr = new byte[i10];
        bArr[0] = 0;
        bArr[1] = (byte) this._type;
        int i11 = this._error;
        bArr[2] = (byte) ((65535 & i11) >> 8);
        bArr[3] = (byte) (i11 & 255);
        System.arraycopy(this._message.getBytes(), 0, bArr, 4, length);
        bArr[length + 4] = 0;
        return new DatagramPacket(bArr, i10, this._address, this._port);
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public String toString() {
        return super.toString() + " ERR " + this._error + " " + this._message;
    }
}

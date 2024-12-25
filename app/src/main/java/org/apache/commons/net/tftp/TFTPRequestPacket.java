package org.apache.commons.net.tftp;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/tftp/TFTPRequestPacket.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/tftp/TFTPRequestPacket.class */
public abstract class TFTPRequestPacket extends TFTPPacket {
    private final String _filename;
    private final int _mode;
    public static final String[] _modeStrings = {"netascii", "octet"};
    private static final byte[][] _modeBytes = {new byte[]{110, 101, 116, 97, 115, 99, 105, 105, 0}, new byte[]{111, 99, 116, 101, 116, 0}};

    public TFTPRequestPacket(int i10, DatagramPacket datagramPacket) {
        super(i10, datagramPacket.getAddress(), datagramPacket.getPort());
        int i11;
        byte b10;
        byte b11;
        byte[] data = datagramPacket.getData();
        if (getType() != data[1]) {
            throw new TFTPPacketException("TFTP operator code does not match type.");
        }
        StringBuilder sb2 = new StringBuilder();
        int i12 = 2;
        int length = datagramPacket.getLength();
        while (i12 < length && (b11 = data[i12]) != 0) {
            sb2.append((char) b11);
            i12++;
        }
        this._filename = sb2.toString();
        if (i12 >= length) {
            throw new TFTPPacketException("Bad filename and mode format.");
        }
        sb2.setLength(0);
        while (true) {
            i12++;
            if (i12 >= length || (b10 = data[i12]) == 0) {
                break;
            } else {
                sb2.append((char) b10);
            }
        }
        String lowerCase = sb2.toString().toLowerCase(Locale.ENGLISH);
        int length2 = _modeStrings.length;
        int i13 = 0;
        while (true) {
            i11 = 0;
            if (i13 >= length2) {
                break;
            }
            if (lowerCase.equals(_modeStrings[i13])) {
                i11 = i13;
                break;
            }
            i13++;
        }
        this._mode = i11;
        if (i13 < length2) {
            return;
        }
        throw new TFTPPacketException("Unrecognized TFTP transfer mode: " + lowerCase);
    }

    public TFTPRequestPacket(InetAddress inetAddress, int i10, int i11, String str, int i12) {
        super(i11, inetAddress, i10);
        this._filename = str;
        this._mode = i12;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public final DatagramPacket _newDatagram(DatagramPacket datagramPacket, byte[] bArr) {
        int length = this._filename.length();
        byte[][] bArr2 = _modeBytes;
        int length2 = bArr2[this._mode].length;
        bArr[0] = 0;
        bArr[1] = (byte) this._type;
        System.arraycopy(this._filename.getBytes(), 0, bArr, 2, length);
        bArr[length + 2] = 0;
        System.arraycopy(bArr2[this._mode], 0, bArr, length + 3, length2);
        datagramPacket.setAddress(this._address);
        datagramPacket.setPort(this._port);
        datagramPacket.setData(bArr);
        datagramPacket.setLength(length + length2 + 3);
        return datagramPacket;
    }

    public final String getFilename() {
        return this._filename;
    }

    public final int getMode() {
        return this._mode;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public final DatagramPacket newDatagram() {
        int length = this._filename.length();
        byte[][] bArr = _modeBytes;
        int length2 = bArr[this._mode].length;
        int i10 = length + length2 + 4;
        byte[] bArr2 = new byte[i10];
        bArr2[0] = 0;
        bArr2[1] = (byte) this._type;
        System.arraycopy(this._filename.getBytes(), 0, bArr2, 2, length);
        bArr2[length + 2] = 0;
        System.arraycopy(bArr[this._mode], 0, bArr2, length + 3, length2);
        return new DatagramPacket(bArr2, i10, this._address, this._port);
    }
}

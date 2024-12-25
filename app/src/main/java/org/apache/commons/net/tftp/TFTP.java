package org.apache.commons.net.tftp;

import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.SocketException;
import org.apache.commons.net.DatagramSocketClient;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/tftp/TFTP.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/tftp/TFTP.class */
public class TFTP extends DatagramSocketClient {
    public static final int ASCII_MODE = 0;
    public static final int BINARY_MODE = 1;
    public static final int DEFAULT_PORT = 69;
    public static final int DEFAULT_TIMEOUT = 5000;
    public static final int IMAGE_MODE = 1;
    public static final int NETASCII_MODE = 0;
    public static final int OCTET_MODE = 1;
    public static final int PACKET_SIZE = 516;
    private byte[] __receiveBuffer;
    private DatagramPacket __receiveDatagram;
    private DatagramPacket __sendDatagram;
    public byte[] _sendBuffer;

    public TFTP() {
        setDefaultTimeout(DEFAULT_TIMEOUT);
        this.__receiveBuffer = null;
        this.__receiveDatagram = null;
    }

    public static final String getModeName(int i10) {
        return TFTPRequestPacket._modeStrings[i10];
    }

    public final void beginBufferedOps() {
        this.__receiveBuffer = new byte[PACKET_SIZE];
        byte[] bArr = this.__receiveBuffer;
        this.__receiveDatagram = new DatagramPacket(bArr, bArr.length);
        this._sendBuffer = new byte[PACKET_SIZE];
        byte[] bArr2 = this._sendBuffer;
        this.__sendDatagram = new DatagramPacket(bArr2, bArr2.length);
    }

    public final TFTPPacket bufferedReceive() {
        this.__receiveDatagram.setData(this.__receiveBuffer);
        this.__receiveDatagram.setLength(this.__receiveBuffer.length);
        this._socket_.receive(this.__receiveDatagram);
        TFTPPacket newTFTPPacket = TFTPPacket.newTFTPPacket(this.__receiveDatagram);
        trace("<", newTFTPPacket);
        return newTFTPPacket;
    }

    public final void bufferedSend(TFTPPacket tFTPPacket) {
        trace(">", tFTPPacket);
        this._socket_.send(tFTPPacket._newDatagram(this.__sendDatagram, this._sendBuffer));
    }

    public final void discardPackets() {
        DatagramPacket datagramPacket = new DatagramPacket(new byte[PACKET_SIZE], PACKET_SIZE);
        int soTimeout = getSoTimeout();
        setSoTimeout(1);
        while (true) {
            try {
                this._socket_.receive(datagramPacket);
            } catch (InterruptedIOException | SocketException e10) {
                setSoTimeout(soTimeout);
                return;
            }
        }
    }

    public final void endBufferedOps() {
        this.__receiveBuffer = null;
        this.__receiveDatagram = null;
        this._sendBuffer = null;
        this.__sendDatagram = null;
    }

    public final TFTPPacket receive() {
        DatagramPacket datagramPacket = new DatagramPacket(new byte[PACKET_SIZE], PACKET_SIZE);
        this._socket_.receive(datagramPacket);
        TFTPPacket newTFTPPacket = TFTPPacket.newTFTPPacket(datagramPacket);
        trace("<", newTFTPPacket);
        return newTFTPPacket;
    }

    public final void send(TFTPPacket tFTPPacket) {
        trace(">", tFTPPacket);
        this._socket_.send(tFTPPacket.newDatagram());
    }

    public void trace(String str, TFTPPacket tFTPPacket) {
    }
}

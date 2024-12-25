package org.apache.commons.net.tftp;

import java.net.DatagramPacket;
import java.net.InetAddress;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/tftp/TFTPWriteRequestPacket.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/tftp/TFTPWriteRequestPacket.class */
public final class TFTPWriteRequestPacket extends TFTPRequestPacket {
    public TFTPWriteRequestPacket(DatagramPacket datagramPacket) {
        super(2, datagramPacket);
    }

    public TFTPWriteRequestPacket(InetAddress inetAddress, int i10, String str, int i11) {
        super(inetAddress, i10, 2, str, i11);
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public String toString() {
        return super.toString() + " WRQ " + getFilename() + " " + TFTP.getModeName(getMode());
    }
}

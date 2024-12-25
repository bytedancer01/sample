package org.apache.commons.net.tftp;

import java.net.DatagramPacket;
import java.net.InetAddress;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/tftp/TFTPReadRequestPacket.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/tftp/TFTPReadRequestPacket.class */
public final class TFTPReadRequestPacket extends TFTPRequestPacket {
    public TFTPReadRequestPacket(DatagramPacket datagramPacket) {
        super(1, datagramPacket);
    }

    public TFTPReadRequestPacket(InetAddress inetAddress, int i10, String str, int i11) {
        super(inetAddress, i10, 1, str, i11);
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public String toString() {
        return super.toString() + " RRQ " + getFilename() + " " + TFTP.getModeName(getMode());
    }
}

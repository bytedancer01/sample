package org.apache.commons.net.tftp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/tftp/TFTPClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/tftp/TFTPClient.class */
public class TFTPClient extends TFTP {
    public static final int DEFAULT_MAX_TIMEOUTS = 5;
    private long totalBytesReceived = 0;
    private long totalBytesSent = 0;
    private int __maxTimeouts = 5;

    public int getMaxTimeouts() {
        return this.__maxTimeouts;
    }

    public long getTotalBytesReceived() {
        return this.totalBytesReceived;
    }

    public long getTotalBytesSent() {
        return this.totalBytesSent;
    }

    public int receiveFile(String str, int i10, OutputStream outputStream, String str2) {
        return receiveFile(str, i10, outputStream, InetAddress.getByName(str2), 69);
    }

    public int receiveFile(String str, int i10, OutputStream outputStream, String str2, int i11) {
        return receiveFile(str, i10, outputStream, InetAddress.getByName(str2), i11);
    }

    public int receiveFile(String str, int i10, OutputStream outputStream, InetAddress inetAddress) {
        return receiveFile(str, i10, outputStream, inetAddress, 69);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03e7, code lost:
    
        if (r13 == (r16 == 0 ? 65535 : r16 - 1)) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x046e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x04cc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int receiveFile(java.lang.String r8, int r9, java.io.OutputStream r10, java.net.InetAddress r11, int r12) {
        /*
            Method dump skipped, instructions count: 1255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.tftp.TFTPClient.receiveFile(java.lang.String, int, java.io.OutputStream, java.net.InetAddress, int):int");
    }

    public void sendFile(String str, int i10, InputStream inputStream, String str2) {
        sendFile(str, i10, inputStream, InetAddress.getByName(str2), 69);
    }

    public void sendFile(String str, int i10, InputStream inputStream, String str2, int i11) {
        sendFile(str, i10, inputStream, InetAddress.getByName(str2), i11);
    }

    public void sendFile(String str, int i10, InputStream inputStream, InetAddress inetAddress) {
        sendFile(str, i10, inputStream, inetAddress, 69);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0311 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sendFile(java.lang.String r10, int r11, java.io.InputStream r12, java.net.InetAddress r13, int r14) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.tftp.TFTPClient.sendFile(java.lang.String, int, java.io.InputStream, java.net.InetAddress, int):void");
    }

    public void setMaxTimeouts(int i10) {
        if (i10 < 1) {
            this.__maxTimeouts = 1;
        } else {
            this.__maxTimeouts = i10;
        }
    }
}

package org.apache.commons.net;

import java.net.DatagramSocket;
import java.net.InetAddress;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/DefaultDatagramSocketFactory.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/DefaultDatagramSocketFactory.class */
public class DefaultDatagramSocketFactory implements DatagramSocketFactory {
    @Override // org.apache.commons.net.DatagramSocketFactory
    public DatagramSocket createDatagramSocket() {
        return new DatagramSocket();
    }

    @Override // org.apache.commons.net.DatagramSocketFactory
    public DatagramSocket createDatagramSocket(int i10) {
        return new DatagramSocket(i10);
    }

    @Override // org.apache.commons.net.DatagramSocketFactory
    public DatagramSocket createDatagramSocket(int i10, InetAddress inetAddress) {
        return new DatagramSocket(i10, inetAddress);
    }
}

package org.apache.commons.net;

import java.net.DatagramSocket;
import java.net.InetAddress;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/DatagramSocketFactory.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/DatagramSocketFactory.class */
public interface DatagramSocketFactory {
    DatagramSocket createDatagramSocket();

    DatagramSocket createDatagramSocket(int i10);

    DatagramSocket createDatagramSocket(int i10, InetAddress inetAddress);
}

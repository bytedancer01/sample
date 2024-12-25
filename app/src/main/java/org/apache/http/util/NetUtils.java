package org.apache.http.util;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* loaded from: combined.jar:classes3.jar:org/apache/http/util/NetUtils.class */
public final class NetUtils {
    public static void formatAddress(StringBuilder sb2, SocketAddress socketAddress) {
        Args.notNull(sb2, "Buffer");
        Args.notNull(socketAddress, "Socket address");
        if (!(socketAddress instanceof InetSocketAddress)) {
            sb2.append(socketAddress);
            return;
        }
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        InetAddress address = inetSocketAddress.getAddress();
        String str = address;
        if (address != null) {
            str = address.getHostAddress();
        }
        sb2.append((Object) str);
        sb2.append(':');
        sb2.append(inetSocketAddress.getPort());
    }
}

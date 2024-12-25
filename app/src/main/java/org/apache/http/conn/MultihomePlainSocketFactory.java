package org.apache.http.conn;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/MultihomePlainSocketFactory.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/MultihomePlainSocketFactory.class */
public final class MultihomePlainSocketFactory implements SocketFactory {
    private static final MultihomePlainSocketFactory DEFAULT_FACTORY = new MultihomePlainSocketFactory();

    private MultihomePlainSocketFactory() {
    }

    public static MultihomePlainSocketFactory getSocketFactory() {
        return DEFAULT_FACTORY;
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket connectSocket(Socket socket, String str, int i10, InetAddress inetAddress, int i11, HttpParams httpParams) {
        Args.notNull(str, "Target host");
        Args.notNull(httpParams, "HTTP parameters");
        Socket socket2 = socket;
        if (socket == null) {
            socket2 = createSocket();
        }
        if (inetAddress != null || i11 > 0) {
            if (i11 <= 0) {
                i11 = 0;
            }
            socket2.bind(new InetSocketAddress(inetAddress, i11));
        }
        int connectionTimeout = HttpConnectionParams.getConnectionTimeout(httpParams);
        InetAddress[] allByName = InetAddress.getAllByName(str);
        ArrayList<InetAddress> arrayList = new ArrayList(allByName.length);
        arrayList.addAll(Arrays.asList(allByName));
        Collections.shuffle(arrayList);
        IOException e10 = null;
        for (InetAddress inetAddress2 : arrayList) {
            try {
                socket2.connect(new InetSocketAddress(inetAddress2, i10), connectionTimeout);
                break;
            } catch (SocketTimeoutException e11) {
                throw new ConnectTimeoutException("Connect to " + inetAddress2 + " timed out");
            } catch (IOException e12) {
                e10 = e12;
                socket2 = new Socket();
            }
        }
        if (e10 == null) {
            return socket2;
        }
        throw e10;
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() {
        return new Socket();
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public final boolean isSecure(Socket socket) {
        Args.notNull(socket, "Socket");
        Asserts.check(!socket.isClosed(), "Socket is closed");
        return false;
    }
}

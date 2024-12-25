package org.apache.http.impl;

import java.net.Socket;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/DefaultHttpClientConnection.class */
public class DefaultHttpClientConnection extends SocketHttpClientConnection {
    @Override // org.apache.http.impl.SocketHttpClientConnection
    public void bind(Socket socket, HttpParams httpParams) {
        Args.notNull(socket, "Socket");
        Args.notNull(httpParams, "HTTP parameters");
        assertNotOpen();
        boolean z10 = true;
        socket.setTcpNoDelay(httpParams.getBooleanParameter(CoreConnectionPNames.TCP_NODELAY, true));
        socket.setSoTimeout(httpParams.getIntParameter(CoreConnectionPNames.SO_TIMEOUT, 0));
        socket.setKeepAlive(httpParams.getBooleanParameter(CoreConnectionPNames.SO_KEEPALIVE, false));
        int intParameter = httpParams.getIntParameter(CoreConnectionPNames.SO_LINGER, -1);
        if (intParameter >= 0) {
            if (intParameter <= 0) {
                z10 = false;
            }
            socket.setSoLinger(z10, intParameter);
        }
        super.bind(socket, httpParams);
    }
}

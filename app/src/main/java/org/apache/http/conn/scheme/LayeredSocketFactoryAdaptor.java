package org.apache.http.conn.scheme;

import java.net.Socket;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/scheme/LayeredSocketFactoryAdaptor.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/scheme/LayeredSocketFactoryAdaptor.class */
class LayeredSocketFactoryAdaptor extends SocketFactoryAdaptor implements LayeredSocketFactory {
    private final LayeredSchemeSocketFactory factory;

    public LayeredSocketFactoryAdaptor(LayeredSchemeSocketFactory layeredSchemeSocketFactory) {
        super(layeredSchemeSocketFactory);
        this.factory = layeredSchemeSocketFactory;
    }

    @Override // org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) {
        return this.factory.createLayeredSocket(socket, str, i10, z10);
    }
}

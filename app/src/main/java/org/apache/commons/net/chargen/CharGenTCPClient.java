package org.apache.commons.net.chargen;

import java.io.InputStream;
import org.apache.commons.net.SocketClient;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/chargen/CharGenTCPClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/chargen/CharGenTCPClient.class */
public final class CharGenTCPClient extends SocketClient {
    public static final int CHARGEN_PORT = 19;
    public static final int DEFAULT_PORT = 19;
    public static final int NETSTAT_PORT = 15;
    public static final int QUOTE_OF_DAY_PORT = 17;
    public static final int SYSTAT_PORT = 11;

    public CharGenTCPClient() {
        setDefaultPort(19);
    }

    public InputStream getInputStream() {
        return this._input_;
    }
}

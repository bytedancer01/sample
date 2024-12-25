package org.apache.commons.net.daytime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.commons.net.SocketClient;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/daytime/DaytimeTCPClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/daytime/DaytimeTCPClient.class */
public final class DaytimeTCPClient extends SocketClient {
    public static final int DEFAULT_PORT = 13;
    private final char[] __buffer = new char[64];

    public DaytimeTCPClient() {
        setDefaultPort(13);
    }

    public String getTime() {
        StringBuilder sb2 = new StringBuilder(this.__buffer.length);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this._input_, getCharset()));
        while (true) {
            char[] cArr = this.__buffer;
            int read = bufferedReader.read(cArr, 0, cArr.length);
            if (read <= 0) {
                return sb2.toString();
            }
            sb2.append(this.__buffer, 0, read);
        }
    }
}

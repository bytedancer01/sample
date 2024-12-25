package org.apache.commons.net.time;

import java.io.DataInputStream;
import java.util.Date;
import org.apache.commons.net.SocketClient;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/time/TimeTCPClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/time/TimeTCPClient.class */
public final class TimeTCPClient extends SocketClient {
    public static final int DEFAULT_PORT = 37;
    public static final long SECONDS_1900_TO_1970 = 2208988800L;

    public TimeTCPClient() {
        setDefaultPort(37);
    }

    public Date getDate() {
        return new Date((getTime() - 2208988800L) * 1000);
    }

    public long getTime() {
        return new DataInputStream(this._input_).readInt() & 4294967295L;
    }
}

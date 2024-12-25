package org.apache.commons.net.finger;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.util.Charsets;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/finger/FingerClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/finger/FingerClient.class */
public class FingerClient extends SocketClient {
    public static final int DEFAULT_PORT = 79;
    private static final String __LONG_FLAG = "/W ";
    private transient char[] __buffer = new char[1024];

    public FingerClient() {
        setDefaultPort(79);
    }

    public InputStream getInputStream(boolean z10) {
        return getInputStream(z10, "");
    }

    public InputStream getInputStream(boolean z10, String str) {
        return getInputStream(z10, str, null);
    }

    public InputStream getInputStream(boolean z10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(64);
        if (z10) {
            sb2.append(__LONG_FLAG);
        }
        sb2.append(str);
        sb2.append(SocketClient.NETASCII_EOL);
        byte[] bytes = sb2.toString().getBytes(Charsets.toCharset(str2).name());
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(this._output_, 1024));
        dataOutputStream.write(bytes, 0, bytes.length);
        dataOutputStream.flush();
        return this._input_;
    }

    public String query(boolean z10) {
        return query(z10, "");
    }

    public String query(boolean z10, String str) {
        StringBuilder sb2 = new StringBuilder(this.__buffer.length);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getInputStream(z10, str), getCharset()));
        while (true) {
            try {
                char[] cArr = this.__buffer;
                int read = bufferedReader.read(cArr, 0, cArr.length);
                if (read <= 0) {
                    bufferedReader.close();
                    return sb2.toString();
                }
                sb2.append(this.__buffer, 0, read);
            } catch (Throwable th2) {
                bufferedReader.close();
                throw th2;
            }
        }
    }
}

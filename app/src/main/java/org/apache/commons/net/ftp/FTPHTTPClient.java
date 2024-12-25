package org.apache.commons.net.ftp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Inet6Address;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.util.Base64;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/FTPHTTPClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/FTPHTTPClient.class */
public class FTPHTTPClient extends FTPClient {
    private static final byte[] CRLF = {13, 10};
    private final Base64 base64;
    private final String proxyHost;
    private final String proxyPassword;
    private final int proxyPort;
    private final String proxyUsername;
    private String tunnelHost;

    public FTPHTTPClient(String str, int i10) {
        this(str, i10, null, null);
    }

    public FTPHTTPClient(String str, int i10, String str2, String str3) {
        this.base64 = new Base64();
        this.proxyHost = str;
        this.proxyPort = i10;
        this.proxyUsername = str2;
        this.proxyPassword = str3;
        this.tunnelHost = null;
    }

    private BufferedReader tunnelHandshake(String str, int i10, InputStream inputStream, OutputStream outputStream) {
        this.tunnelHost = str;
        outputStream.write(("CONNECT " + str + ":" + i10 + " HTTP/1.1").getBytes("UTF-8"));
        byte[] bArr = CRLF;
        outputStream.write(bArr);
        outputStream.write(("Host: " + str + ":" + i10).getBytes("UTF-8"));
        outputStream.write(bArr);
        if (this.proxyUsername != null && this.proxyPassword != null) {
            outputStream.write(("Proxy-Authorization: Basic " + this.base64.encodeToString((this.proxyUsername + ":" + this.proxyPassword).getBytes("UTF-8"))).getBytes("UTF-8"));
        }
        outputStream.write(bArr);
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, getCharset()));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null || readLine.length() <= 0) {
                break;
            }
            arrayList.add(readLine);
        }
        if (arrayList.size() == 0) {
            throw new IOException("No response from proxy");
        }
        String str2 = (String) arrayList.get(0);
        if (!str2.startsWith("HTTP/") || str2.length() < 12) {
            throw new IOException("Invalid response from proxy: " + str2);
        }
        if ("200".equals(str2.substring(9, 12))) {
            return bufferedReader;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HTTPTunnelConnector: connection failed\r\n");
        sb2.append("Response received from the proxy:\r\n");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(SocketClient.NETASCII_EOL);
        }
        throw new IOException(sb2.toString());
    }

    @Override // org.apache.commons.net.ftp.FTPClient
    @Deprecated
    public Socket _openDataConnection_(int i10, String str) {
        return super._openDataConnection_(i10, str);
    }

    @Override // org.apache.commons.net.ftp.FTPClient
    public Socket _openDataConnection_(String str, String str2) {
        String passiveHost;
        if (getDataConnectionMode() != 2) {
            throw new IllegalStateException("Only passive connection mode supported");
        }
        boolean z10 = getRemoteAddress() instanceof Inet6Address;
        if ((isUseEPSVwithIPv4() || z10) && epsv() == 229) {
            _parseExtendedPassiveModeReply(this._replyLines.get(0));
            passiveHost = this.tunnelHost;
        } else {
            if (z10 || pasv() != 227) {
                return null;
            }
            _parsePassiveModeReply(this._replyLines.get(0));
            passiveHost = getPassiveHost();
        }
        Socket createSocket = this._socketFactory_.createSocket(this.proxyHost, this.proxyPort);
        tunnelHandshake(passiveHost, getPassivePort(), createSocket.getInputStream(), createSocket.getOutputStream());
        if (getRestartOffset() > 0 && !restart(getRestartOffset())) {
            createSocket.close();
            return null;
        }
        if (FTPReply.isPositivePreliminary(sendCommand(str, str2))) {
            return createSocket;
        }
        createSocket.close();
        return null;
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(String str, int i10) {
        Socket createSocket = this._socketFactory_.createSocket(this.proxyHost, this.proxyPort);
        this._socket_ = createSocket;
        this._input_ = createSocket.getInputStream();
        OutputStream outputStream = this._socket_.getOutputStream();
        this._output_ = outputStream;
        try {
            super._connectAction_(tunnelHandshake(str, i10, this._input_, outputStream));
        } catch (Exception e10) {
            IOException iOException = new IOException("Could not connect to " + str + " using port " + i10);
            iOException.initCause(e10);
            throw iOException;
        }
    }
}

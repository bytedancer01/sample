package org.apache.commons.net.ftp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import org.apache.commons.net.util.Base64;
import org.apache.commons.net.util.SSLContextUtils;
import org.apache.commons.net.util.SSLSocketUtils;
import org.apache.commons.net.util.TrustManagerUtils;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/FTPSClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/FTPSClient.class */
public class FTPSClient extends FTPClient {
    private static final String CMD_ADAT = "ADAT";
    private static final String CMD_AUTH = "AUTH";
    private static final String CMD_CCC = "CCC";
    private static final String CMD_CONF = "CONF";
    private static final String CMD_ENC = "ENC";
    private static final String CMD_MIC = "MIC";
    private static final String CMD_PBSZ = "PBSZ";
    private static final String CMD_PROT = "PROT";
    public static final int DEFAULT_FTPS_DATA_PORT = 989;
    public static final int DEFAULT_FTPS_PORT = 990;
    private static final String DEFAULT_PROTOCOL = "TLS";

    @Deprecated
    public static String KEYSTORE_ALGORITHM;

    @Deprecated
    public static String PROVIDER;

    @Deprecated
    public static String STORE_TYPE;

    @Deprecated
    public static String TRUSTSTORE_ALGORITHM;
    private String auth;
    private SSLContext context;
    private HostnameVerifier hostnameVerifier;
    private boolean isClientMode;
    private boolean isCreation;
    private final boolean isImplicit;
    private boolean isNeedClientAuth;
    private boolean isWantClientAuth;
    private KeyManager keyManager;
    private Socket plainSocket;
    private final String protocol;
    private String[] protocols;
    private String[] suites;
    private boolean tlsEndpointChecking;
    private TrustManager trustManager;
    private static final String DEFAULT_PROT = "C";
    private static final String[] PROT_COMMAND_VALUE = {DEFAULT_PROT, "E", "S", "P"};

    public FTPSClient() {
        this("TLS", false);
    }

    public FTPSClient(String str) {
        this(str, false);
    }

    public FTPSClient(String str, boolean z10) {
        this.auth = "TLS";
        this.isCreation = true;
        this.isClientMode = true;
        this.isNeedClientAuth = false;
        this.isWantClientAuth = false;
        this.suites = null;
        this.protocols = null;
        this.trustManager = TrustManagerUtils.getValidateServerCertificateTrustManager();
        this.keyManager = null;
        this.hostnameVerifier = null;
        this.protocol = str;
        this.isImplicit = z10;
        if (z10) {
            setDefaultPort(DEFAULT_FTPS_PORT);
        }
    }

    public FTPSClient(SSLContext sSLContext) {
        this(false, sSLContext);
    }

    public FTPSClient(boolean z10) {
        this("TLS", z10);
    }

    public FTPSClient(boolean z10, SSLContext sSLContext) {
        this("TLS", z10);
        this.context = sSLContext;
    }

    private boolean checkPROTValue(String str) {
        for (String str2 : PROT_COMMAND_VALUE) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private String extractPrefixedData(String str, String str2) {
        int indexOf = str2.indexOf(str);
        if (indexOf == -1) {
            return null;
        }
        return str2.substring(indexOf + str.length()).trim();
    }

    private KeyManager getKeyManager() {
        return this.keyManager;
    }

    private void initSslContext() {
        if (this.context == null) {
            this.context = SSLContextUtils.createSSLContext(this.protocol, getKeyManager(), getTrustManager());
        }
    }

    @Override // org.apache.commons.net.ftp.FTPClient, org.apache.commons.net.ftp.FTP, org.apache.commons.net.SocketClient
    public void _connectAction_() {
        if (this.isImplicit) {
            sslNegotiation();
        }
        super._connectAction_();
        if (this.isImplicit) {
            return;
        }
        execAUTH();
        sslNegotiation();
    }

    @Override // org.apache.commons.net.ftp.FTPClient
    @Deprecated
    public Socket _openDataConnection_(int i10, String str) {
        return _openDataConnection_(FTPCommand.getCommand(i10), str);
    }

    @Override // org.apache.commons.net.ftp.FTPClient
    public Socket _openDataConnection_(String str, String str2) {
        Socket _openDataConnection_ = super._openDataConnection_(str, str2);
        _prepareDataSocket_(_openDataConnection_);
        if (_openDataConnection_ instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) _openDataConnection_;
            sSLSocket.setUseClientMode(this.isClientMode);
            sSLSocket.setEnableSessionCreation(this.isCreation);
            if (!this.isClientMode) {
                sSLSocket.setNeedClientAuth(this.isNeedClientAuth);
                sSLSocket.setWantClientAuth(this.isWantClientAuth);
            }
            String[] strArr = this.suites;
            if (strArr != null) {
                sSLSocket.setEnabledCipherSuites(strArr);
            }
            String[] strArr2 = this.protocols;
            if (strArr2 != null) {
                sSLSocket.setEnabledProtocols(strArr2);
            }
            sSLSocket.startHandshake();
        }
        return _openDataConnection_;
    }

    public void _prepareDataSocket_(Socket socket) {
    }

    @Override // org.apache.commons.net.ftp.FTPClient, org.apache.commons.net.ftp.FTP, org.apache.commons.net.SocketClient
    public void disconnect() {
        super.disconnect();
        Socket socket = this.plainSocket;
        if (socket != null) {
            socket.close();
        }
        setSocketFactory(null);
        setServerSocketFactory(null);
    }

    public int execADAT(byte[] bArr) {
        return bArr != null ? sendCommand(CMD_ADAT, Base64.encodeBase64StringUnChunked(bArr)) : sendCommand(CMD_ADAT);
    }

    public int execAUTH(String str) {
        return sendCommand(CMD_AUTH, str);
    }

    public void execAUTH() {
        int sendCommand = sendCommand(CMD_AUTH, this.auth);
        if (334 != sendCommand && 234 != sendCommand) {
            throw new SSLException(getReplyString());
        }
    }

    public int execCCC() {
        return sendCommand(CMD_CCC);
    }

    public int execCONF(byte[] bArr) {
        return sendCommand(CMD_CONF, bArr != null ? Base64.encodeBase64StringUnChunked(bArr) : "");
    }

    public int execENC(byte[] bArr) {
        return sendCommand(CMD_ENC, bArr != null ? Base64.encodeBase64StringUnChunked(bArr) : "");
    }

    public int execMIC(byte[] bArr) {
        return sendCommand(CMD_MIC, bArr != null ? Base64.encodeBase64StringUnChunked(bArr) : "");
    }

    public void execPBSZ(long j10) {
        if (j10 < 0 || 4294967295L < j10) {
            throw new IllegalArgumentException();
        }
        if (200 != sendCommand(CMD_PBSZ, String.valueOf(j10))) {
            throw new SSLException(getReplyString());
        }
    }

    public void execPROT(String str) {
        String str2 = str;
        if (str == null) {
            str2 = DEFAULT_PROT;
        }
        if (!checkPROTValue(str2)) {
            throw new IllegalArgumentException();
        }
        if (200 != sendCommand(CMD_PROT, str2)) {
            throw new SSLException(getReplyString());
        }
        if (DEFAULT_PROT.equals(str2)) {
            setSocketFactory(null);
            setServerSocketFactory(null);
        } else {
            setSocketFactory(new FTPSSocketFactory(this.context));
            setServerSocketFactory(new FTPSServerSocketFactory(this.context));
            initSslContext();
        }
    }

    public String getAuthValue() {
        return this.auth;
    }

    public boolean getEnableSessionCreation() {
        Socket socket = this._socket_;
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getEnableSessionCreation();
        }
        return false;
    }

    public String[] getEnabledCipherSuites() {
        Socket socket = this._socket_;
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getEnabledCipherSuites();
        }
        return null;
    }

    public String[] getEnabledProtocols() {
        Socket socket = this._socket_;
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getEnabledProtocols();
        }
        return null;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public boolean getNeedClientAuth() {
        Socket socket = this._socket_;
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getNeedClientAuth();
        }
        return false;
    }

    public TrustManager getTrustManager() {
        return this.trustManager;
    }

    public boolean getUseClientMode() {
        Socket socket = this._socket_;
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getUseClientMode();
        }
        return false;
    }

    public boolean getWantClientAuth() {
        Socket socket = this._socket_;
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getWantClientAuth();
        }
        return false;
    }

    public boolean isEndpointCheckingEnabled() {
        return this.tlsEndpointChecking;
    }

    public byte[] parseADATReply(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decodeBase64(extractPrefixedData("ADAT=", str));
    }

    public long parsePBSZ(long j10) {
        execPBSZ(j10);
        String extractPrefixedData = extractPrefixedData("PBSZ=", getReplyString());
        long j11 = j10;
        if (extractPrefixedData != null) {
            long parseLong = Long.parseLong(extractPrefixedData);
            j11 = j10;
            if (parseLong < j10) {
                j11 = parseLong;
            }
        }
        return j11;
    }

    @Override // org.apache.commons.net.ftp.FTP
    public int sendCommand(String str, String str2) {
        int sendCommand = super.sendCommand(str, str2);
        if (CMD_CCC.equals(str)) {
            if (200 != sendCommand) {
                throw new SSLException(getReplyString());
            }
            this._socket_.close();
            this._socket_ = this.plainSocket;
            this._controlInput_ = new BufferedReader(new InputStreamReader(this._socket_.getInputStream(), getControlEncoding()));
            this._controlOutput_ = new BufferedWriter(new OutputStreamWriter(this._socket_.getOutputStream(), getControlEncoding()));
        }
        return sendCommand;
    }

    public void setAuthValue(String str) {
        this.auth = str;
    }

    public void setEnabledCipherSuites(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        this.suites = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
    }

    public void setEnabledProtocols(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        this.protocols = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
    }

    public void setEnabledSessionCreation(boolean z10) {
        this.isCreation = z10;
    }

    public void setEndpointCheckingEnabled(boolean z10) {
        this.tlsEndpointChecking = z10;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
    }

    public void setKeyManager(KeyManager keyManager) {
        this.keyManager = keyManager;
    }

    public void setNeedClientAuth(boolean z10) {
        this.isNeedClientAuth = z10;
    }

    public void setTrustManager(TrustManager trustManager) {
        this.trustManager = trustManager;
    }

    public void setUseClientMode(boolean z10) {
        this.isClientMode = z10;
    }

    public void setWantClientAuth(boolean z10) {
        this.isWantClientAuth = z10;
    }

    public void sslNegotiation() {
        HostnameVerifier hostnameVerifier;
        this.plainSocket = this._socket_;
        initSslContext();
        SSLSocketFactory socketFactory = this.context.getSocketFactory();
        String str = this._hostname_;
        if (str == null) {
            str = getRemoteAddress().getHostAddress();
        }
        SSLSocket sSLSocket = (SSLSocket) socketFactory.createSocket(this._socket_, str, this._socket_.getPort(), false);
        sSLSocket.setEnableSessionCreation(this.isCreation);
        sSLSocket.setUseClientMode(this.isClientMode);
        if (!this.isClientMode) {
            sSLSocket.setNeedClientAuth(this.isNeedClientAuth);
            sSLSocket.setWantClientAuth(this.isWantClientAuth);
        } else if (this.tlsEndpointChecking) {
            SSLSocketUtils.enableEndpointNameVerification(sSLSocket);
        }
        String[] strArr = this.protocols;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = this.suites;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
        sSLSocket.startHandshake();
        this._socket_ = sSLSocket;
        this._controlInput_ = new BufferedReader(new InputStreamReader(sSLSocket.getInputStream(), getControlEncoding()));
        this._controlOutput_ = new BufferedWriter(new OutputStreamWriter(sSLSocket.getOutputStream(), getControlEncoding()));
        if (this.isClientMode && (hostnameVerifier = this.hostnameVerifier) != null && !hostnameVerifier.verify(str, sSLSocket.getSession())) {
            throw new SSLHandshakeException("Hostname doesn't match certificate");
        }
    }
}

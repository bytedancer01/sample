package org.apache.commons.net.pop3;

import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import org.apache.commons.net.p255io.CRLFLineReader;
import org.apache.commons.net.util.SSLContextUtils;
import org.apache.commons.net.util.SSLSocketUtils;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/pop3/POP3SClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/pop3/POP3SClient.class */
public class POP3SClient extends POP3Client {
    private static final int DEFAULT_POP3S_PORT = 995;
    private static final String DEFAULT_PROTOCOL = "TLS";
    private SSLContext context;
    private HostnameVerifier hostnameVerifier;
    private final boolean isImplicit;
    private KeyManager keyManager;
    private final String protocol;
    private String[] protocols;
    private String[] suites;
    private boolean tlsEndpointChecking;
    private TrustManager trustManager;

    public POP3SClient() {
        this("TLS", false);
    }

    public POP3SClient(String str) {
        this(str, false);
    }

    public POP3SClient(String str, boolean z10) {
        this(str, z10, null);
    }

    public POP3SClient(String str, boolean z10, SSLContext sSLContext) {
        this.suites = null;
        this.protocols = null;
        this.trustManager = null;
        this.keyManager = null;
        this.hostnameVerifier = null;
        this.protocol = str;
        this.isImplicit = z10;
        this.context = sSLContext;
        if (z10) {
            setDefaultPort(DEFAULT_POP3S_PORT);
        }
    }

    public POP3SClient(SSLContext sSLContext) {
        this(false, sSLContext);
    }

    public POP3SClient(boolean z10) {
        this("TLS", z10);
    }

    public POP3SClient(boolean z10, SSLContext sSLContext) {
        this("TLS", z10, sSLContext);
    }

    private KeyManager getKeyManager() {
        return this.keyManager;
    }

    private void initSSLContext() {
        if (this.context == null) {
            this.context = SSLContextUtils.createSSLContext(this.protocol, getKeyManager(), getTrustManager());
        }
    }

    private void performSSLNegotiation() {
        initSSLContext();
        SSLSocketFactory socketFactory = this.context.getSocketFactory();
        String str = this._hostname_;
        if (str == null) {
            str = getRemoteAddress().getHostAddress();
        }
        SSLSocket sSLSocket = (SSLSocket) socketFactory.createSocket(this._socket_, str, getRemotePort(), true);
        sSLSocket.setEnableSessionCreation(true);
        sSLSocket.setUseClientMode(true);
        if (this.tlsEndpointChecking) {
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
        this._input_ = sSLSocket.getInputStream();
        this._output_ = sSLSocket.getOutputStream();
        this._reader = new CRLFLineReader(new InputStreamReader(this._input_, "ISO-8859-1"));
        this._writer = new BufferedWriter(new OutputStreamWriter(this._output_, "ISO-8859-1"));
        HostnameVerifier hostnameVerifier = this.hostnameVerifier;
        if (hostnameVerifier != null && !hostnameVerifier.verify(str, sSLSocket.getSession())) {
            throw new SSLHandshakeException("Hostname doesn't match certificate");
        }
    }

    @Override // org.apache.commons.net.pop3.POP3, org.apache.commons.net.SocketClient
    public void _connectAction_() {
        if (this.isImplicit) {
            performSSLNegotiation();
        }
        super._connectAction_();
    }

    public boolean execTLS() {
        if (sendCommand("STLS") != 0) {
            return false;
        }
        performSSLNegotiation();
        return true;
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

    public TrustManager getTrustManager() {
        return this.trustManager;
    }

    public boolean isEndpointCheckingEnabled() {
        return this.tlsEndpointChecking;
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

    public void setEndpointCheckingEnabled(boolean z10) {
        this.tlsEndpointChecking = z10;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
    }

    public void setKeyManager(KeyManager keyManager) {
        this.keyManager = keyManager;
    }

    public void setTrustManager(TrustManager trustManager) {
        this.trustManager = trustManager;
    }
}

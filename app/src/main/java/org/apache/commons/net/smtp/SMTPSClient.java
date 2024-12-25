package org.apache.commons.net.smtp;

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
  classes2.jar:org/apache/commons/net/smtp/SMTPSClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/smtp/SMTPSClient.class */
public class SMTPSClient extends SMTPClient {
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

    public SMTPSClient() {
        this("TLS", false);
    }

    public SMTPSClient(String str) {
        this(str, false);
    }

    public SMTPSClient(String str, boolean z10) {
        this.context = null;
        this.suites = null;
        this.protocols = null;
        this.trustManager = null;
        this.keyManager = null;
        this.hostnameVerifier = null;
        this.protocol = str;
        this.isImplicit = z10;
    }

    public SMTPSClient(String str, boolean z10, String str2) {
        super(str2);
        this.context = null;
        this.suites = null;
        this.protocols = null;
        this.trustManager = null;
        this.keyManager = null;
        this.hostnameVerifier = null;
        this.protocol = str;
        this.isImplicit = z10;
    }

    public SMTPSClient(SSLContext sSLContext) {
        this(false, sSLContext);
    }

    public SMTPSClient(boolean z10) {
        this("TLS", z10);
    }

    public SMTPSClient(boolean z10, SSLContext sSLContext) {
        this.suites = null;
        this.protocols = null;
        this.trustManager = null;
        this.keyManager = null;
        this.hostnameVerifier = null;
        this.isImplicit = z10;
        this.context = sSLContext;
        this.protocol = "TLS";
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
        this._reader = new CRLFLineReader(new InputStreamReader(this._input_, this.encoding));
        this._writer = new BufferedWriter(new OutputStreamWriter(this._output_, this.encoding));
        HostnameVerifier hostnameVerifier = this.hostnameVerifier;
        if (hostnameVerifier != null && !hostnameVerifier.verify(str, sSLSocket.getSession())) {
            throw new SSLHandshakeException("Hostname doesn't match certificate");
        }
    }

    @Override // org.apache.commons.net.smtp.SMTP, org.apache.commons.net.SocketClient
    public void _connectAction_() {
        if (this.isImplicit) {
            performSSLNegotiation();
        }
        super._connectAction_();
    }

    public boolean execTLS() {
        if (!SMTPReply.isPositiveCompletion(sendCommand("STARTTLS"))) {
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

    public KeyManager getKeyManager() {
        return this.keyManager;
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

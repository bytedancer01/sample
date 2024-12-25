package org.apache.http.impl.client;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.auth.AuthState;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.params.HttpClientParamConfig;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.conn.HttpConnectionFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.auth.BasicSchemeFactory;
import org.apache.http.impl.auth.DigestSchemeFactory;
import org.apache.http.impl.auth.KerberosSchemeFactory;
import org.apache.http.impl.auth.NTLMSchemeFactory;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.conn.ManagedHttpClientConnectionFactory;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParamConfig;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/ProxyClient.class */
public class ProxyClient {
    private final AuthSchemeRegistry authSchemeRegistry;
    private final org.apache.http.impl.auth.HttpAuthenticator authenticator;
    private final HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> connFactory;
    private final ConnectionConfig connectionConfig;
    private final HttpProcessor httpProcessor;
    private final AuthState proxyAuthState;
    private final ProxyAuthenticationStrategy proxyAuthStrategy;
    private final RequestConfig requestConfig;
    private final HttpRequestExecutor requestExec;
    private final ConnectionReuseStrategy reuseStrategy;

    public ProxyClient() {
        this(null, null, null);
    }

    public ProxyClient(RequestConfig requestConfig) {
        this(null, null, requestConfig);
    }

    public ProxyClient(HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, ConnectionConfig connectionConfig, RequestConfig requestConfig) {
        this.connFactory = httpConnectionFactory == null ? ManagedHttpClientConnectionFactory.INSTANCE : httpConnectionFactory;
        this.connectionConfig = connectionConfig == null ? ConnectionConfig.DEFAULT : connectionConfig;
        this.requestConfig = requestConfig == null ? RequestConfig.DEFAULT : requestConfig;
        this.httpProcessor = new ImmutableHttpProcessor(new RequestTargetHost(), new RequestClientConnControl(), new RequestUserAgent());
        this.requestExec = new HttpRequestExecutor();
        this.proxyAuthStrategy = new ProxyAuthenticationStrategy();
        this.authenticator = new org.apache.http.impl.auth.HttpAuthenticator();
        this.proxyAuthState = new AuthState();
        AuthSchemeRegistry authSchemeRegistry = new AuthSchemeRegistry();
        this.authSchemeRegistry = authSchemeRegistry;
        authSchemeRegistry.register("Basic", new BasicSchemeFactory());
        authSchemeRegistry.register("Digest", new DigestSchemeFactory());
        authSchemeRegistry.register("NTLM", new NTLMSchemeFactory());
        authSchemeRegistry.register("Negotiate", new SPNegoSchemeFactory());
        authSchemeRegistry.register("Kerberos", new KerberosSchemeFactory());
        this.reuseStrategy = new DefaultConnectionReuseStrategy();
    }

    @Deprecated
    public ProxyClient(HttpParams httpParams) {
        this(null, HttpParamConfig.getConnectionConfig(httpParams), HttpClientParamConfig.getRequestConfig(httpParams));
    }

    @Deprecated
    public AuthSchemeRegistry getAuthSchemeRegistry() {
        return this.authSchemeRegistry;
    }

    @Deprecated
    public HttpParams getParams() {
        return new BasicHttpParams();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x01c0, code lost:
    
        if (r0.getStatusLine().getStatusCode() <= 299) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01c3, code lost:
    
        r0 = r0.getEntity();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01cb, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01ce, code lost:
    
        r0.setEntity(new org.apache.http.entity.BufferedHttpEntity(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01dc, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x020a, code lost:
    
        throw new org.apache.http.impl.execchain.TunnelRefusedException("CONNECT refused by proxy: " + r0.getStatusLine(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0212, code lost:
    
        return r0.getSocket();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.net.Socket tunnel(org.apache.http.HttpHost r10, org.apache.http.HttpHost r11, org.apache.http.auth.Credentials r12) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.ProxyClient.tunnel(org.apache.http.HttpHost, org.apache.http.HttpHost, org.apache.http.auth.Credentials):java.net.Socket");
    }
}

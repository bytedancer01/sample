package org.apache.http.impl.conn;

import java.net.InetAddress;
import java.net.Socket;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeLayeredSocketFactory;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/DefaultClientConnectionOperator.class */
public class DefaultClientConnectionOperator implements ClientConnectionOperator {
    public final DnsResolver dnsResolver;
    private final Log log = LogFactory.getLog(getClass());
    public final SchemeRegistry schemeRegistry;

    public DefaultClientConnectionOperator(SchemeRegistry schemeRegistry) {
        Args.notNull(schemeRegistry, "Scheme registry");
        this.schemeRegistry = schemeRegistry;
        this.dnsResolver = new SystemDefaultDnsResolver();
    }

    public DefaultClientConnectionOperator(SchemeRegistry schemeRegistry, DnsResolver dnsResolver) {
        Args.notNull(schemeRegistry, "Scheme registry");
        Args.notNull(dnsResolver, "DNS resolver");
        this.schemeRegistry = schemeRegistry;
        this.dnsResolver = dnsResolver;
    }

    private SchemeRegistry getSchemeRegistry(HttpContext httpContext) {
        SchemeRegistry schemeRegistry = (SchemeRegistry) httpContext.getAttribute(ClientContext.SCHEME_REGISTRY);
        SchemeRegistry schemeRegistry2 = schemeRegistry;
        if (schemeRegistry == null) {
            schemeRegistry2 = this.schemeRegistry;
        }
        return schemeRegistry2;
    }

    @Override // org.apache.http.conn.ClientConnectionOperator
    public OperatedClientConnection createConnection() {
        return new DefaultClientConnection();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017e A[SYNTHETIC] */
    @Override // org.apache.http.conn.ClientConnectionOperator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void openConnection(org.apache.http.conn.OperatedClientConnection r7, org.apache.http.HttpHost r8, java.net.InetAddress r9, org.apache.http.protocol.HttpContext r10, org.apache.http.params.HttpParams r11) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(org.apache.http.conn.OperatedClientConnection, org.apache.http.HttpHost, java.net.InetAddress, org.apache.http.protocol.HttpContext, org.apache.http.params.HttpParams):void");
    }

    public void prepareSocket(Socket socket, HttpContext httpContext, HttpParams httpParams) {
        socket.setTcpNoDelay(HttpConnectionParams.getTcpNoDelay(httpParams));
        socket.setSoTimeout(HttpConnectionParams.getSoTimeout(httpParams));
        int linger = HttpConnectionParams.getLinger(httpParams);
        if (linger >= 0) {
            socket.setSoLinger(linger > 0, linger);
        }
    }

    public InetAddress[] resolveHostname(String str) {
        return this.dnsResolver.resolve(str);
    }

    @Override // org.apache.http.conn.ClientConnectionOperator
    public void updateSecureConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, HttpContext httpContext, HttpParams httpParams) {
        Args.notNull(operatedClientConnection, "Connection");
        Args.notNull(httpHost, "Target host");
        Args.notNull(httpParams, "Parameters");
        Asserts.check(operatedClientConnection.isOpen(), "Connection must be open");
        Scheme scheme = getSchemeRegistry(httpContext).getScheme(httpHost.getSchemeName());
        Asserts.check(scheme.getSchemeSocketFactory() instanceof SchemeLayeredSocketFactory, "Socket factory must implement SchemeLayeredSocketFactory");
        SchemeLayeredSocketFactory schemeLayeredSocketFactory = (SchemeLayeredSocketFactory) scheme.getSchemeSocketFactory();
        Socket createLayeredSocket = schemeLayeredSocketFactory.createLayeredSocket(operatedClientConnection.getSocket(), httpHost.getHostName(), scheme.resolvePort(httpHost.getPort()), httpParams);
        prepareSocket(createLayeredSocket, httpContext, httpParams);
        operatedClientConnection.update(createLayeredSocket, httpHost, schemeLayeredSocketFactory.isSecure(createLayeredSocket), httpParams);
    }
}

package org.apache.http.impl.conn;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/SchemeRegistryFactory.class */
public final class SchemeRegistryFactory {
    public static SchemeRegistry createDefault() {
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme(HttpHost.DEFAULT_SCHEME_NAME, 80, PlainSocketFactory.getSocketFactory()));
        schemeRegistry.register(new Scheme(ClientConstants.DOMAIN_SCHEME, 443, SSLSocketFactory.getSocketFactory()));
        return schemeRegistry;
    }

    public static SchemeRegistry createSystemDefault() {
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme(HttpHost.DEFAULT_SCHEME_NAME, 80, PlainSocketFactory.getSocketFactory()));
        schemeRegistry.register(new Scheme(ClientConstants.DOMAIN_SCHEME, 443, SSLSocketFactory.getSystemSocketFactory()));
        return schemeRegistry;
    }
}

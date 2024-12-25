package ua;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.joda.time.DateTimeConstants;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/k7.class
 */
/* renamed from: ua.k7 */
/* loaded from: combined.jar:classes2.jar:ua/k7.class */
public final class C8968k7 extends AbstractC9119x5 {

    /* renamed from: c */
    public final SSLSocketFactory f41263c;

    public C8968k7(C8870c5 c8870c5) {
        super(c8870c5);
        this.f41263c = null;
    }

    @Override // ua.AbstractC9119x5
    /* renamed from: i */
    public final boolean mo37851i() {
        return false;
    }

    /* renamed from: o */
    public final HttpURLConnection m38101o(URL url) {
        URLConnection openConnection = url.openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain HTTP connection");
        }
        SSLSocketFactory sSLSocketFactory = this.f41263c;
        if (sSLSocketFactory != null && (openConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) openConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setDefaultUseCaches(false);
        this.f41723a.m37797z();
        httpURLConnection.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
        this.f41723a.m37797z();
        httpURLConnection.setReadTimeout(61000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }
}

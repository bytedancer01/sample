package ua;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.joda.time.DateTimeConstants;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/e4.class
 */
/* renamed from: ua.e4 */
/* loaded from: combined.jar:classes2.jar:ua/e4.class */
public final class C8893e4 extends AbstractC9030p9 {

    /* renamed from: d */
    public final SSLSocketFactory f41033d;

    public C8893e4(C9123x9 c9123x9) {
        super(c9123x9);
        this.f41033d = null;
    }

    @Override // ua.AbstractC9030p9
    /* renamed from: l */
    public final boolean mo37812l() {
        return false;
    }

    /* renamed from: m */
    public final boolean m37813m() {
        NetworkInfo networkInfo;
        m38183j();
        try {
            networkInfo = ((ConnectivityManager) this.f41723a.mo37779b().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e10) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* renamed from: n */
    public final HttpURLConnection m37814n(URL url) {
        URLConnection openConnection = url.openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain HTTP connection");
        }
        SSLSocketFactory sSLSocketFactory = this.f41033d;
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

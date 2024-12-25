package p415y2;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import p395x2.AbstractC9635n;
import p395x2.C9628g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y2/h.class
 */
/* renamed from: y2.h */
/* loaded from: combined.jar:classes1.jar:y2/h.class */
public class C9811h extends AbstractC9804a {

    /* renamed from: a */
    public final b f45131a;

    /* renamed from: b */
    public final SSLSocketFactory f45132b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y2/h$a.class
     */
    /* renamed from: y2.h$a */
    /* loaded from: combined.jar:classes1.jar:y2/h$a.class */
    public static class a extends FilterInputStream {

        /* renamed from: b */
        public final HttpURLConnection f45133b;

        public a(HttpURLConnection httpURLConnection) {
            super(C9811h.m41335h(httpURLConnection));
            this.f45133b = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            this.f45133b.disconnect();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y2/h$b.class
     */
    /* renamed from: y2.h$b */
    /* loaded from: combined.jar:classes1.jar:y2/h$b.class */
    public interface b {
        /* renamed from: a */
        String m41339a(String str);
    }

    public C9811h() {
        this(null);
    }

    public C9811h(b bVar) {
        this(bVar, null);
    }

    public C9811h(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f45131a = bVar;
        this.f45132b = sSLSocketFactory;
    }

    /* renamed from: c */
    public static void m41331c(HttpURLConnection httpURLConnection, AbstractC9635n<?> abstractC9635n, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", abstractC9635n.m40554n());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    /* renamed from: d */
    public static void m41332d(HttpURLConnection httpURLConnection, AbstractC9635n<?> abstractC9635n) {
        byte[] m40553m = abstractC9635n.m40553m();
        if (m40553m != null) {
            m41331c(httpURLConnection, abstractC9635n, m40553m);
        }
    }

    /* renamed from: e */
    public static List<C9628g> m41333e(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new C9628g(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static boolean m41334g(int i10, int i11) {
        return (i10 == 4 || (100 <= i11 && i11 < 200) || i11 == 204 || i11 == 304) ? false : true;
    }

    /* renamed from: h */
    public static InputStream m41335h(HttpURLConnection httpURLConnection) {
        InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException e10) {
            errorStream = httpURLConnection.getErrorStream();
        }
        return errorStream;
    }

    /* renamed from: j */
    public static void m41336j(HttpURLConnection httpURLConnection, AbstractC9635n<?> abstractC9635n) {
        String str;
        String str2;
        switch (abstractC9635n.m40558r()) {
            case -1:
                byte[] m40561u = abstractC9635n.m40561u();
                if (m40561u != null) {
                    httpURLConnection.setRequestMethod("POST");
                    m41331c(httpURLConnection, abstractC9635n, m40561u);
                    return;
                }
                return;
            case 0:
                str = HttpGet.METHOD_NAME;
                httpURLConnection.setRequestMethod(str);
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m41332d(httpURLConnection, abstractC9635n);
                return;
            case 2:
                str2 = HttpPut.METHOD_NAME;
                httpURLConnection.setRequestMethod(str2);
                m41332d(httpURLConnection, abstractC9635n);
                return;
            case 3:
                str = HttpDelete.METHOD_NAME;
                httpURLConnection.setRequestMethod(str);
                return;
            case 4:
                str = HttpHead.METHOD_NAME;
                httpURLConnection.setRequestMethod(str);
                return;
            case 5:
                str = HttpOptions.METHOD_NAME;
                httpURLConnection.setRequestMethod(str);
                return;
            case 6:
                str = HttpTrace.METHOD_NAME;
                httpURLConnection.setRequestMethod(str);
                return;
            case 7:
                str2 = HttpPatch.METHOD_NAME;
                httpURLConnection.setRequestMethod(str2);
                m41332d(httpURLConnection, abstractC9635n);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    @Override // p415y2.AbstractC9804a
    /* renamed from: a */
    public C9809f mo41287a(AbstractC9635n<?> abstractC9635n, Map<String, String> map) {
        String m40531B = abstractC9635n.m40531B();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(abstractC9635n.m40557q());
        b bVar = this.f45131a;
        String str = m40531B;
        if (bVar != null) {
            str = bVar.m41339a(m40531B);
            if (str == null) {
                throw new IOException("URL blocked by rewriter: " + m40531B);
            }
        }
        HttpURLConnection m41338i = m41338i(new URL(str), abstractC9635n);
        try {
            for (String str2 : hashMap.keySet()) {
                m41338i.setRequestProperty(str2, (String) hashMap.get(str2));
            }
            m41336j(m41338i, abstractC9635n);
            int responseCode = m41338i.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (m41334g(abstractC9635n.m40558r(), responseCode)) {
                return new C9809f(responseCode, m41333e(m41338i.getHeaderFields()), m41338i.getContentLength(), new a(m41338i));
            }
            C9809f c9809f = new C9809f(responseCode, m41333e(m41338i.getHeaderFields()));
            m41338i.disconnect();
            return c9809f;
        } catch (Throwable th2) {
            if (0 == 0) {
                m41338i.disconnect();
            }
            throw th2;
        }
    }

    /* renamed from: f */
    public HttpURLConnection m41337f(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    /* renamed from: i */
    public final HttpURLConnection m41338i(URL url, AbstractC9635n<?> abstractC9635n) {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection m41337f = m41337f(url);
        int m40566z = abstractC9635n.m40566z();
        m41337f.setConnectTimeout(m40566z);
        m41337f.setReadTimeout(m40566z);
        m41337f.setUseCaches(false);
        m41337f.setDoInput(true);
        if (ClientConstants.DOMAIN_SCHEME.equals(url.getProtocol()) && (sSLSocketFactory = this.f45132b) != null) {
            ((HttpsURLConnection) m41337f).setSSLSocketFactory(sSLSocketFactory);
        }
        return m41337f;
    }
}

package p416y3;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p073e4.C4609d;
import p329t3.EnumC8619i;
import p363v4.C9236b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y3/f.class
 */
/* renamed from: y3.f */
/* loaded from: combined.jar:classes1.jar:y3/f.class */
public class C9820f implements InterfaceC9817c<InputStream> {

    /* renamed from: f */
    public static final c f45147f = new b();

    /* renamed from: a */
    public final C4609d f45148a;

    /* renamed from: b */
    public final c f45149b;

    /* renamed from: c */
    public HttpURLConnection f45150c;

    /* renamed from: d */
    public InputStream f45151d;

    /* renamed from: e */
    public volatile boolean f45152e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y3/f$b.class
     */
    /* renamed from: y3.f$b */
    /* loaded from: combined.jar:classes1.jar:y3/f$b.class */
    public static class b implements c {
        public b() {
        }

        @Override // p416y3.C9820f.c
        /* renamed from: a */
        public HttpURLConnection mo41358a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y3/f$c.class
     */
    /* renamed from: y3.f$c */
    /* loaded from: combined.jar:classes1.jar:y3/f$c.class */
    public interface c {
        /* renamed from: a */
        HttpURLConnection mo41358a(URL url);
    }

    public C9820f(C4609d c4609d) {
        this(c4609d, f45147f);
    }

    public C9820f(C4609d c4609d, c cVar) {
        this.f45148a = c4609d;
        this.f45149b = cVar;
    }

    @Override // p416y3.InterfaceC9817c
    /* renamed from: a */
    public void mo23240a() {
        InputStream inputStream = this.f45151d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
            }
        }
        HttpURLConnection httpURLConnection = this.f45150c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: c */
    public final InputStream m41355c(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            inputStream = C9236b.m38945l(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            inputStream = httpURLConnection.getInputStream();
        }
        this.f45151d = inputStream;
        return this.f45151d;
    }

    @Override // p416y3.InterfaceC9817c
    public void cancel() {
        this.f45152e = true;
    }

    @Override // p416y3.InterfaceC9817c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream mo23241b(EnumC8619i enumC8619i) {
        return m41357e(this.f45148a.m23239e(), 0, null, this.f45148a.m23236b());
    }

    /* renamed from: e */
    public final InputStream m41357e(URL url, int i10, URL url2, Map<String, String> map) {
        if (i10 >= 5) {
            throw new IOException("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new IOException("In re-direct loop");
                }
            } catch (URISyntaxException e10) {
            }
        }
        this.f45150c = this.f45149b.mo41358a(url);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f45150c.addRequestProperty(entry.getKey(), entry.getValue());
        }
        this.f45150c.setConnectTimeout(2500);
        this.f45150c.setReadTimeout(2500);
        this.f45150c.setUseCaches(false);
        this.f45150c.setDoInput(true);
        this.f45150c.connect();
        if (this.f45152e) {
            return null;
        }
        int responseCode = this.f45150c.getResponseCode();
        int i11 = responseCode / 100;
        if (i11 == 2) {
            return m41355c(this.f45150c);
        }
        if (i11 == 3) {
            String headerField = this.f45150c.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new IOException("Received empty or null redirect url");
            }
            return m41357e(new URL(url, headerField), i10 + 1, url, map);
        }
        if (responseCode == -1) {
            throw new IOException("Unable to retrieve response code from HttpUrlConnection.");
        }
        throw new IOException("Request failed " + responseCode + ": " + this.f45150c.getResponseMessage());
    }

    @Override // p416y3.InterfaceC9817c
    public String getId() {
        return this.f45148a.m23235a();
    }
}

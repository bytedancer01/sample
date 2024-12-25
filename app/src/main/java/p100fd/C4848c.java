package p100fd;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import bd.InterfaceC0891b;
import cd.C1068h;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.p045s3.internal.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p060da.C4402a;
import p060da.C4411j;
import p100fd.AbstractC4849d;
import p100fd.AbstractC4851f;
import p169jd.InterfaceC5364i;
import p422y9.C9935o;
import p425yc.InterfaceC9979f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fd/c.class
 */
/* renamed from: fd.c */
/* loaded from: combined.jar:classes2.jar:fd/c.class */
public class C4848c {

    /* renamed from: e */
    public static final Pattern f28467e = Pattern.compile("[0-9]+s");

    /* renamed from: f */
    public static final Charset f28468f = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Context f28469a;

    /* renamed from: b */
    public final InterfaceC0891b<InterfaceC5364i> f28470b;

    /* renamed from: c */
    public final InterfaceC0891b<InterfaceC9979f> f28471c;

    /* renamed from: d */
    public final C4850e f28472d = new C4850e();

    public C4848c(Context context, InterfaceC0891b<InterfaceC5364i> interfaceC0891b, InterfaceC0891b<InterfaceC9979f> interfaceC0891b2) {
        this.f28469a = context;
        this.f28470b = interfaceC0891b;
        this.f28471c = interfaceC0891b2;
    }

    /* renamed from: a */
    public static String m24639a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    /* renamed from: b */
    public static JSONObject m24640b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.5");
            return jSONObject;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: c */
    public static JSONObject m24641c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.5");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: h */
    public static byte[] m24642h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    public static boolean m24643i(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    /* renamed from: j */
    public static void m24644j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: k */
    public static void m24645k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String m24647o = m24647o(httpURLConnection);
        if (TextUtils.isEmpty(m24647o)) {
            return;
        }
        Log.w("Firebase-Installations", m24647o);
        Log.w("Firebase-Installations", m24639a(str, str2, str3));
    }

    /* renamed from: m */
    public static long m24646m(String str) {
        C9935o.m41842b(f28467e.matcher(str).matches(), "Invalid Expiration Timestamp.");
        return (str == null || str.length() == 0) ? 0L : Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: o */
    public static String m24647o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f28468f));
        try {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
                sb2.append('\n');
            }
            String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
            try {
                bufferedReader.close();
            } catch (IOException e10) {
            }
            return format;
        } catch (IOException e11) {
            try {
                bufferedReader.close();
                return null;
            } catch (IOException e12) {
                return null;
            }
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (IOException e13) {
            }
            throw th2;
        }
    }

    /* renamed from: s */
    public static void m24648s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException e10) {
            }
        }
    }

    /* renamed from: d */
    public AbstractC4849d m24649d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        if (!this.f28472d.m24662b()) {
            throw new C1068h("Firebase Installations Service is unavailable. Please try again later.", C1068h.a.UNAVAILABLE);
        }
        URL m24652g = m24652g(String.format("projects/%s/installations", str3));
        for (int i10 = 0; i10 <= 1; i10++) {
            HttpURLConnection m24653l = m24653l(m24652g, str);
            try {
                try {
                    m24653l.setRequestMethod("POST");
                    m24653l.setDoOutput(true);
                    if (str5 != null) {
                        m24653l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m24656q(m24653l, str2, str4);
                    responseCode = m24653l.getResponseCode();
                    this.f28472d.m24664f(responseCode);
                } finally {
                    m24653l.disconnect();
                }
            } catch (IOException | AssertionError e10) {
            }
            if (m24643i(responseCode)) {
                return m24654n(m24653l);
            }
            m24645k(m24653l, str4, str, str3);
            if (responseCode == 429) {
                throw new C1068h("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C1068h.a.TOO_MANY_REQUESTS);
            }
            if (responseCode < 500 || responseCode >= 600) {
                m24644j();
                return AbstractC4849d.m24658a().mo24630e(AbstractC4849d.b.BAD_CONFIG).mo24626a();
            }
            m24653l.disconnect();
        }
        throw new C1068h("Firebase Installations Service is unavailable. Please try again later.", C1068h.a.UNAVAILABLE);
    }

    /* renamed from: e */
    public AbstractC4851f m24650e(String str, String str2, String str3, String str4) {
        int responseCode;
        if (!this.f28472d.m24662b()) {
            throw new C1068h("Firebase Installations Service is unavailable. Please try again later.", C1068h.a.UNAVAILABLE);
        }
        URL m24652g = m24652g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i10 = 0; i10 <= 1; i10++) {
            HttpURLConnection m24653l = m24653l(m24652g, str);
            try {
                try {
                    m24653l.setRequestMethod("POST");
                    m24653l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    m24653l.setDoOutput(true);
                    m24657r(m24653l);
                    responseCode = m24653l.getResponseCode();
                    this.f28472d.m24664f(responseCode);
                } catch (IOException | AssertionError e10) {
                }
                if (m24643i(responseCode)) {
                    return m24655p(m24653l);
                }
                m24645k(m24653l, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    return AbstractC4851f.m24665a().mo24636b(AbstractC4851f.b.AUTH_ERROR).mo24635a();
                }
                if (responseCode == 429) {
                    throw new C1068h("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C1068h.a.TOO_MANY_REQUESTS);
                }
                if (responseCode < 500 || responseCode >= 600) {
                    m24644j();
                    return AbstractC4851f.m24665a().mo24636b(AbstractC4851f.b.BAD_CONFIG).mo24635a();
                }
                m24653l.disconnect();
            } finally {
                m24653l.disconnect();
            }
        }
        throw new C1068h("Firebase Installations Service is unavailable. Please try again later.", C1068h.a.UNAVAILABLE);
    }

    /* renamed from: f */
    public final String m24651f() {
        try {
            Context context = this.f28469a;
            byte[] m22425a = C4402a.m22425a(context, context.getPackageName());
            if (m22425a != null) {
                return C4411j.m22447b(m22425a, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f28469a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("ContentValues", "No such package: " + this.f28469a.getPackageName(), e10);
            return null;
        }
    }

    /* renamed from: g */
    public final URL m24652g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            throw new C1068h(e10.getMessage(), C1068h.a.UNAVAILABLE);
        }
    }

    /* renamed from: l */
    public final HttpURLConnection m24653l(URL url, String str) {
        InterfaceC9979f.a mo41921a;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(Constants.MAXIMUM_UPLOAD_PARTS);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(Constants.MAXIMUM_UPLOAD_PARTS);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f28469a.getPackageName());
            if (this.f28471c.get() != null && this.f28470b.get() != null && (mo41921a = this.f28471c.get().mo41921a("fire-installations-id")) != InterfaceC9979f.a.NONE) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f28470b.get().mo26658a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(mo41921a.getCode()));
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m24651f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException e10) {
            throw new C1068h("Firebase Installations Service is unavailable. Please try again later.", C1068h.a.UNAVAILABLE);
        }
    }

    /* renamed from: n */
    public final AbstractC4849d m24654n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f28468f));
        AbstractC4851f.a m24665a = AbstractC4851f.m24665a();
        AbstractC4849d.a m24658a = AbstractC4849d.m24658a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                m24658a.mo24631f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                m24658a.mo24628c(jsonReader.nextString());
            } else if (nextName.equals(ClientConstants.TOKEN_TYPE_REFRESH)) {
                m24658a.mo24629d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        m24665a.mo24637c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        m24665a.mo24638d(m24646m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                m24658a.mo24627b(m24665a.mo24635a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m24658a.mo24630e(AbstractC4849d.b.OK).mo24626a();
    }

    /* renamed from: p */
    public final AbstractC4851f m24655p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f28468f));
        AbstractC4851f.a m24665a = AbstractC4851f.m24665a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                m24665a.mo24637c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                m24665a.mo24638d(m24646m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m24665a.mo24636b(AbstractC4851f.b.OK).mo24635a();
    }

    /* renamed from: q */
    public final void m24656q(HttpURLConnection httpURLConnection, String str, String str2) {
        m24648s(httpURLConnection, m24642h(m24640b(str, str2)));
    }

    /* renamed from: r */
    public final void m24657r(HttpURLConnection httpURLConnection) {
        m24648s(httpURLConnection, m24642h(m24641c()));
    }
}

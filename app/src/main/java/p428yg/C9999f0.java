package p428yg;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p428yg.InterfaceC10004j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/f0.class
 */
/* renamed from: yg.f0 */
/* loaded from: combined.jar:classes2.jar:yg/f0.class */
public class C9999f0 implements InterfaceC10004j {

    /* renamed from: b */
    public static volatile Object f45831b;

    /* renamed from: c */
    public static final Object f45832c = new Object();

    /* renamed from: d */
    public static final ThreadLocal<StringBuilder> f45833d = new a();

    /* renamed from: a */
    public final Context f45834a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/f0$a.class
     */
    /* renamed from: yg.f0$a */
    /* loaded from: combined.jar:classes2.jar:yg/f0$a.class */
    public static final class a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/f0$b.class
     */
    /* renamed from: yg.f0$b */
    /* loaded from: combined.jar:classes2.jar:yg/f0$b.class */
    public static class b {
        /* renamed from: a */
        public static Object m42035a(Context context) {
            File m42042f = C10001g0.m42042f(context);
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            HttpResponseCache httpResponseCache = installed;
            if (installed == null) {
                httpResponseCache = HttpResponseCache.install(m42042f, C10001g0.m42037a(m42042f));
            }
            return httpResponseCache;
        }
    }

    public C9999f0(Context context) {
        this.f45834a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static void m42031b(Context context) {
        if (f45831b == null) {
            try {
                synchronized (f45832c) {
                    if (f45831b == null) {
                        f45831b = b.m42035a(context);
                    }
                }
            } catch (IOException e10) {
            }
        }
    }

    @Override // p428yg.InterfaceC10004j
    /* renamed from: a */
    public InterfaceC10004j.a mo42032a(Uri uri, int i10) {
        String sb2;
        m42031b(this.f45834a);
        HttpURLConnection m42033c = m42033c(uri);
        m42033c.setUseCaches(true);
        if (i10 != 0) {
            if (EnumC10011q.isOfflineOnly(i10)) {
                sb2 = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb3 = f45833d.get();
                sb3.setLength(0);
                if (!EnumC10011q.shouldReadFromDiskCache(i10)) {
                    sb3.append("no-cache");
                }
                if (!EnumC10011q.shouldWriteToDiskCache(i10)) {
                    if (sb3.length() > 0) {
                        sb3.append(',');
                    }
                    sb3.append("no-store");
                }
                sb2 = sb3.toString();
            }
            m42033c.setRequestProperty("Cache-Control", sb2);
        }
        int responseCode = m42033c.getResponseCode();
        if (responseCode < 300) {
            return new InterfaceC10004j.a(m42033c.getInputStream(), C10001g0.m42059w(m42033c.getHeaderField("X-Android-Response-Source")), m42033c.getHeaderFieldInt("Content-Length", -1));
        }
        m42033c.disconnect();
        throw new InterfaceC10004j.b(responseCode + " " + m42033c.getResponseMessage(), i10, responseCode);
    }

    /* renamed from: c */
    public HttpURLConnection m42033c(Uri uri) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }
}

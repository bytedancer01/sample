package id;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p422y9.C9935o;
import pa.C7688g;
import pa.C7689h;
import pa.C7696o;
import za.AbstractC10144i;
import za.C10148l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:id/p.class
 */
/* renamed from: id.p */
/* loaded from: combined.jar:classes2.jar:id/p.class */
public class C5234p implements Closeable {

    /* renamed from: b */
    public final URL f29936b;

    /* renamed from: c */
    public AbstractC10144i<Bitmap> f29937c;

    /* renamed from: d */
    public volatile InputStream f29938d;

    public C5234p(URL url) {
        this.f29936b = url;
    }

    /* renamed from: o */
    public static C5234p m26107o(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C5234p(new URL(str));
        } catch (MalformedURLException e10) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            C7689h.m33629a(this.f29938d);
        } catch (NullPointerException e10) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e10);
        }
    }

    /* renamed from: f */
    public Bitmap m26108f() {
        String valueOf = String.valueOf(this.f29936b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
        sb2.append("Starting download of: ");
        sb2.append(valueOf);
        Log.i("FirebaseMessaging", sb2.toString());
        byte[] m26109l = m26109l();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m26109l, 0, m26109l.length);
        if (decodeByteArray == null) {
            String valueOf2 = String.valueOf(this.f29936b);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 24);
            sb3.append("Failed to decode image: ");
            sb3.append(valueOf2);
            throw new IOException(sb3.toString());
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf3 = String.valueOf(this.f29936b);
            StringBuilder sb4 = new StringBuilder(valueOf3.length() + 31);
            sb4.append("Successfully downloaded image: ");
            sb4.append(valueOf3);
            Log.d("FirebaseMessaging", sb4.toString());
        }
        return decodeByteArray;
    }

    /* renamed from: l */
    public final byte[] m26109l() {
        URLConnection openConnection = this.f29936b.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            this.f29938d = inputStream;
            byte[] m33626a = C7688g.m33626a(C7688g.m33627b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                String valueOf = String.valueOf(this.f29936b);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 34);
                sb2.append("Downloaded ");
                sb2.append(m33626a.length);
                sb2.append(" bytes from ");
                sb2.append(valueOf);
                Log.v("FirebaseMessaging", sb2.toString());
            }
            if (m33626a.length <= 1048576) {
                return m33626a;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    C7696o.m33632a(th2, th3);
                }
            }
            throw th2;
        }
    }

    /* renamed from: p */
    public AbstractC10144i<Bitmap> m26110p() {
        return (AbstractC10144i) C9935o.m41850j(this.f29937c);
    }

    /* renamed from: q */
    public void m26111q(Executor executor) {
        this.f29937c = C10148l.m42585c(executor, new Callable(this) { // from class: id.o

            /* renamed from: a */
            public final C5234p f29935a;

            {
                this.f29935a = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return this.f29935a.m26108f();
            }
        });
    }
}

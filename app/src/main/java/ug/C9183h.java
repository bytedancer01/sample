package ug;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.http.HttpHost;
import p411xi.C9761e;
import p411xi.C9764h;
import p411xi.InterfaceC9756b0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ug/h.class
 */
/* renamed from: ug.h */
/* loaded from: combined.jar:classes2.jar:ug/h.class */
public final class C9183h {

    /* renamed from: a */
    public static final byte[] f42012a = new byte[0];

    /* renamed from: b */
    public static final String[] f42013b = new String[0];

    /* renamed from: c */
    public static final Charset f42014c = Charset.forName("US-ASCII");

    /* renamed from: d */
    public static final Charset f42015d = Charset.forName("UTF-8");

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ug/h$a.class
     */
    /* renamed from: ug.h$a */
    /* loaded from: combined.jar:classes2.jar:ug/h$a.class */
    public static final class a implements ThreadFactory {

        /* renamed from: a */
        public final String f42016a;

        /* renamed from: b */
        public final boolean f42017b;

        public a(String str, boolean z10) {
            this.f42016a = str;
            this.f42017b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f42016a);
            thread.setDaemon(this.f42017b);
            return thread;
        }
    }

    /* renamed from: a */
    public static void m38681a(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: b */
    public static void m38682b(Closeable closeable, Closeable closeable2) {
        IOException iOException;
        try {
            closeable.close();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            closeable2.close();
            iOException = th;
        } catch (Throwable th3) {
            iOException = th;
            if (th == null) {
                iOException = th3;
            }
        }
        if (iOException == null) {
            return;
        }
        if (iOException instanceof IOException) {
            throw iOException;
        }
        if (iOException instanceof RuntimeException) {
            throw ((RuntimeException) iOException);
        }
        if (!(iOException instanceof Error)) {
            throw new AssertionError(iOException);
        }
        throw ((Error) iOException);
    }

    /* renamed from: c */
    public static void m38683c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
            }
        }
    }

    /* renamed from: d */
    public static void m38684d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
            }
        }
    }

    /* renamed from: e */
    public static void m38685e(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                m38685e(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }

    /* renamed from: f */
    public static boolean m38686f(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: g */
    public static int m38687g(String str) {
        if (HttpHost.DEFAULT_SCHEME_NAME.equals(str)) {
            return 80;
        }
        return ClientConstants.DOMAIN_SCHEME.equals(str) ? 443 : -1;
    }

    /* renamed from: h */
    public static int m38688h(String str, int i10) {
        if (i10 == -1) {
            i10 = m38687g(str);
        }
        return i10;
    }

    /* renamed from: i */
    public static int m38689i(URI uri) {
        return m38688h(uri.getScheme(), uri.getPort());
    }

    /* renamed from: j */
    public static int m38690j(URL url) {
        return m38688h(url.getProtocol(), url.getPort());
    }

    /* renamed from: k */
    public static String m38691k(String str) {
        try {
            return C9764h.m41184t(MessageDigest.getInstance(MessageDigestAlgorithms.MD5).digest(str.getBytes("UTF-8"))).mo41198p();
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new AssertionError(e11);
        }
    }

    /* renamed from: l */
    public static <T> List<T> m38692l(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: m */
    public static <T> List<T> m38693m(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: n */
    public static <K, V> Map<K, V> m38694n(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: o */
    public static <T> List<T> m38695o(Collection<T> collection, Collection<T> collection2) {
        ArrayList arrayList = new ArrayList();
        for (T t10 : collection) {
            if (collection2.contains(t10)) {
                arrayList.add(t10);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: p */
    public static C9764h m38696p(C9764h c9764h) {
        try {
            return C9764h.m41184t(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_1).digest(c9764h.mo41187C()));
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: q */
    public static boolean m38697q(InterfaceC9756b0 interfaceC9756b0, int i10) {
        long nanoTime = System.nanoTime();
        C9761e c9761e = new C9761e();
        while (TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime) < i10) {
            if (interfaceC9756b0.mo22901x(c9761e, 2048L) == -1) {
                return true;
            }
            c9761e.m41165l();
        }
        return false;
    }

    /* renamed from: r */
    public static ThreadFactory m38698r(String str, boolean z10) {
        return new a(str, z10);
    }
}

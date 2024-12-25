package p428yg;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import com.amazonaws.services.p045s3.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/g0.class
 */
/* renamed from: yg.g0 */
/* loaded from: combined.jar:classes2.jar:yg/g0.class */
public final class C10001g0 {

    /* renamed from: a */
    public static final StringBuilder f45836a = new StringBuilder();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/g0$a.class
     */
    /* renamed from: yg.g0$a */
    /* loaded from: combined.jar:classes2.jar:yg/g0$a.class */
    public static final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/g0$b.class
     */
    @TargetApi(11)
    /* renamed from: yg.g0$b */
    /* loaded from: combined.jar:classes2.jar:yg/g0$b.class */
    public static class b {
        /* renamed from: a */
        public static int m42061a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/g0$c.class
     */
    @TargetApi(12)
    /* renamed from: yg.g0$c */
    /* loaded from: combined.jar:classes2.jar:yg/g0$c.class */
    public static class c {
        /* renamed from: a */
        public static int m42062a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/g0$d.class
     */
    /* renamed from: yg.g0$d */
    /* loaded from: combined.jar:classes2.jar:yg/g0$d.class */
    public static class d {
        /* renamed from: a */
        public static InterfaceC10004j m42063a(Context context) {
            return new C10013s(context);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/g0$e.class
     */
    /* renamed from: yg.g0$e */
    /* loaded from: combined.jar:classes2.jar:yg/g0$e.class */
    public static class e extends Thread {
        public e(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/g0$f.class
     */
    /* renamed from: yg.g0$f */
    /* loaded from: combined.jar:classes2.jar:yg/g0$f.class */
    public static class f implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new e(runnable);
        }
    }

    /* renamed from: a */
    public static long m42037a(File file) {
        long j10;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j10 = (statFs.getBlockCount() * statFs.getBlockSize()) / 50;
        } catch (IllegalArgumentException e10) {
            j10 = 5242880;
        }
        return Math.max(Math.min(j10, 52428800L), 5242880L);
    }

    /* renamed from: b */
    public static int m42038b(Context context) {
        ActivityManager activityManager = (ActivityManager) m42052p(context, "activity");
        boolean z10 = (context.getApplicationInfo().flags & Constants.f7590MB) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z10) {
            memoryClass = b.m42061a(activityManager);
        }
        return (memoryClass * Constants.f7590MB) / 7;
    }

    /* renamed from: c */
    public static void m42039c() {
        if (!m42055s()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* renamed from: d */
    public static <T> T m42040d(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    public static void m42041e(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException e10) {
        }
    }

    /* renamed from: f */
    public static File m42042f(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: g */
    public static InterfaceC10004j m42043g(Context context) {
        try {
            Class.forName("tg.q");
            return d.m42063a(context);
        } catch (ClassNotFoundException e10) {
            return new C9999f0(context);
        }
    }

    /* renamed from: h */
    public static String m42044h(C10017w c10017w) {
        StringBuilder sb2 = f45836a;
        String m42045i = m42045i(c10017w, sb2);
        sb2.setLength(0);
        return m42045i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m42045i(p428yg.C10017w r4, java.lang.StringBuilder r5) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p428yg.C10001g0.m42045i(yg.w, java.lang.StringBuilder):java.lang.String");
    }

    /* renamed from: j */
    public static void m42046j(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    /* renamed from: k */
    public static int m42047k(Bitmap bitmap) {
        int m42062a = c.m42062a(bitmap);
        if (m42062a >= 0) {
            return m42062a;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* renamed from: l */
    public static String m42048l(RunnableC9992c runnableC9992c) {
        return m42049m(runnableC9992c, "");
    }

    /* renamed from: m */
    public static String m42049m(RunnableC9992c runnableC9992c, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        AbstractC9988a m42011h = runnableC9992c.m42011h();
        if (m42011h != null) {
            sb2.append(m42011h.f45756b.m42135d());
        }
        List<AbstractC9988a> m42012i = runnableC9992c.m42012i();
        if (m42012i != null) {
            int size = m42012i.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0 || m42011h != null) {
                    sb2.append(", ");
                }
                sb2.append(m42012i.get(i10).f45756b.m42135d());
            }
        }
        return sb2.toString();
    }

    /* renamed from: n */
    public static int m42050n(Resources resources, C10017w c10017w) {
        Uri uri;
        int parseInt;
        int i10 = c10017w.f45929e;
        if (i10 != 0 || (uri = c10017w.f45928d) == null) {
            return i10;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + c10017w.f45928d);
        }
        List<String> pathSegments = c10017w.f45928d.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + c10017w.f45928d);
        }
        if (pathSegments.size() == 1) {
            try {
                parseInt = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException e10) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + c10017w.f45928d);
            }
        } else {
            if (pathSegments.size() != 2) {
                throw new FileNotFoundException("More than two path segments: " + c10017w.f45928d);
            }
            parseInt = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        return parseInt;
    }

    /* renamed from: o */
    public static Resources m42051o(Context context, C10017w c10017w) {
        Uri uri;
        if (c10017w.f45929e != 0 || (uri = c10017w.f45928d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + c10017w.f45928d);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + c10017w.f45928d);
        }
    }

    /* renamed from: p */
    public static <T> T m42052p(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    /* renamed from: q */
    public static boolean m42053q(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: r */
    public static boolean m42054r(Context context) {
        boolean z10 = false;
        try {
            if (Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z10 = true;
            }
        } catch (NullPointerException e10) {
        }
        return z10;
    }

    /* renamed from: s */
    public static boolean m42055s() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: t */
    public static boolean m42056t(InputStream inputStream) {
        byte[] bArr = new byte[12];
        boolean z10 = false;
        if (inputStream.read(bArr, 0, 12) == 12) {
            z10 = false;
            if ("RIFF".equals(new String(bArr, 0, 4, "US-ASCII"))) {
                z10 = false;
                if ("WEBP".equals(new String(bArr, 8, 4, "US-ASCII"))) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* renamed from: u */
    public static void m42057u(String str, String str2, String str3) {
        m42058v(str, str2, str3, "");
    }

    /* renamed from: v */
    public static void m42058v(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }

    /* renamed from: w */
    public static boolean m42059w(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        boolean z10 = false;
        try {
            if ("CONDITIONAL_CACHE".equals(split[0])) {
                z10 = false;
                if (Integer.parseInt(split[1]) == 304) {
                    z10 = true;
                }
            }
        } catch (NumberFormatException e10) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: x */
    public static byte[] m42060x(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}

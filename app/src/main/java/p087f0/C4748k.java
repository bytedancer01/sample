package p087f0;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p191l0.C5643f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f0/k.class
 */
/* renamed from: f0.k */
/* loaded from: combined.jar:classes1.jar:f0/k.class */
public class C4748k {
    /* renamed from: a */
    public static void m24037a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
            }
        }
    }

    /* renamed from: b */
    public static ByteBuffer m24038b(Context context, Resources resources, int i10) {
        File m24041e = m24041e(context);
        if (m24041e == null) {
            return null;
        }
        try {
            if (m24039c(m24041e, resources, i10)) {
                return m24043g(m24041e);
            }
            m24041e.delete();
            return null;
        } finally {
            m24041e.delete();
        }
    }

    /* renamed from: c */
    public static boolean m24039c(File file, Resources resources, int i10) {
        InputStream inputStream;
        InputStream openRawResource;
        try {
            openRawResource = resources.openRawResource(i10);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            boolean m24040d = m24040d(file, openRawResource);
            m24037a(openRawResource);
            return m24040d;
        } catch (Throwable th3) {
            th = th3;
            inputStream = openRawResource;
            m24037a(inputStream);
            throw th;
        }
    }

    /* renamed from: d */
    public static boolean m24040d(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            m24037a(fileOutputStream3);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream3.write(bArr, 0, read);
                    }
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream3;
                    FileOutputStream fileOutputStream4 = fileOutputStream;
                    StringBuilder sb2 = new StringBuilder();
                    FileOutputStream fileOutputStream5 = fileOutputStream;
                    sb2.append("Error copying resource contents to temp file: ");
                    FileOutputStream fileOutputStream6 = fileOutputStream;
                    sb2.append(e.getMessage());
                    fileOutputStream2 = fileOutputStream;
                    Log.e("TypefaceCompatUtil", sb2.toString());
                    m24037a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream3;
                    m24037a(fileOutputStream2);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            e = e11;
            fileOutputStream = null;
        }
    }

    /* renamed from: e */
    public static File m24041e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static ByteBuffer m24042f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor == null) {
                    return null;
                }
                openFileDescriptor.close();
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException e10) {
            return null;
        }
    }

    /* renamed from: g */
    public static ByteBuffer m24043g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } finally {
            }
        } catch (IOException e10) {
            return null;
        }
    }

    /* renamed from: h */
    public static Map<Uri, ByteBuffer> m24044h(Context context, C5643f.b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C5643f.b bVar : bVarArr) {
            if (bVar.m27854b() == 0) {
                Uri m27856d = bVar.m27856d();
                if (!hashMap.containsKey(m27856d)) {
                    hashMap.put(m27856d, m24042f(context, cancellationSignal, m27856d));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}

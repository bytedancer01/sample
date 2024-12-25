package p222n1;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.amplifyframework.core.model.ModelIdentifier;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n1/b.class
 */
/* renamed from: n1.b */
/* loaded from: combined.jar:classes1.jar:n1/b.class */
public final class C6619b implements Closeable {

    /* renamed from: b */
    public final File f34530b;

    /* renamed from: c */
    public final long f34531c;

    /* renamed from: d */
    public final File f34532d;

    /* renamed from: e */
    public final RandomAccessFile f34533e;

    /* renamed from: f */
    public final FileChannel f34534f;

    /* renamed from: g */
    public final FileLock f34535g;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n1/b$a.class
     */
    /* renamed from: n1.b$a */
    /* loaded from: combined.jar:classes1.jar:n1/b$a.class */
    public class a implements FileFilter {

        /* renamed from: a */
        public final C6619b f34536a;

        public a(C6619b c6619b) {
            this.f34536a = c6619b;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n1/b$b.class
     */
    /* renamed from: n1.b$b */
    /* loaded from: combined.jar:classes1.jar:n1/b$b.class */
    public static class b extends File {

        /* renamed from: b */
        public long f34537b;

        public b(File file, String str) {
            super(file, str);
            this.f34537b = -1L;
        }
    }

    public C6619b(File file, File file2) {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f34530b = file;
        this.f34532d = file2;
        this.f34531c = m30557t(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f34533e = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f34534f = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f34535g = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException | Error | RuntimeException e10) {
                m30552l(this.f34534f);
                throw e10;
            }
        } catch (IOException | Error | RuntimeException e11) {
            m30552l(this.f34533e);
            throw e11;
        }
    }

    /* renamed from: l */
    public static void m30552l(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("MultiDex", "Failed to close resource", e10);
        }
    }

    /* renamed from: o */
    public static void m30553o(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        zipOutputStream.write(bArr, 0, read);
                    }
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!createTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            } catch (Throwable th2) {
                zipOutputStream.close();
                throw th2;
            }
        } finally {
            m30552l(inputStream);
            createTempFile.delete();
        }
    }

    /* renamed from: o0 */
    public static void m30554o0(Context context, String str, long j10, long j11, List<b> list) {
        SharedPreferences.Editor edit = m30555p(context).edit();
        edit.putLong(str + "timestamp", j10);
        edit.putLong(str + "crc", j11);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i10 = 2;
        for (b bVar : list) {
            edit.putLong(str + "dex.crc." + i10, bVar.f34537b);
            edit.putLong(str + "dex.time." + i10, bVar.lastModified());
            i10++;
        }
        edit.commit();
    }

    /* renamed from: p */
    public static SharedPreferences m30555p(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* renamed from: q */
    public static long m30556q(File file) {
        long lastModified = file.lastModified();
        long j10 = lastModified;
        if (lastModified == -1) {
            j10 = lastModified - 1;
        }
        return j10;
    }

    /* renamed from: t */
    public static long m30557t(File file) {
        long m30565c = C6620c.m30565c(file);
        long j10 = m30565c;
        if (m30565c == -1) {
            j10 = m30565c - 1;
        }
        return j10;
    }

    /* renamed from: v */
    public static boolean m30558v(Context context, File file, long j10, String str) {
        boolean z10;
        SharedPreferences m30555p = m30555p(context);
        if (m30555p.getLong(str + "timestamp", -1L) == m30556q(file)) {
            if (m30555p.getLong(str + "crc", -1L) == j10) {
                z10 = false;
                return z10;
            }
        }
        z10 = true;
        return z10;
    }

    /* renamed from: B */
    public final List<b> m30559B() {
        String str = this.f34530b.getName() + ".classes";
        m30560f();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f34530b);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i10 = 2;
            while (entry != null) {
                b bVar = new b(this.f34532d, str + i10 + ".zip");
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                boolean z10 = false;
                for (int i11 = 0; i11 < 3 && !z10; i11++) {
                    m30553o(zipFile, entry, bVar, str);
                    try {
                        bVar.f34537b = m30557t(bVar);
                        z10 = true;
                    } catch (IOException e10) {
                        Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e10);
                        z10 = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z10 ? "succeeded" : "failed");
                    sb2.append(" '");
                    sb2.append(bVar.getAbsolutePath());
                    sb2.append("': length ");
                    sb2.append(bVar.length());
                    sb2.append(" - crc: ");
                    sb2.append(bVar.f34537b);
                    Log.i("MultiDex", sb2.toString());
                    if (!z10) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                }
                if (!z10) {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
                i10++;
                entry = zipFile.getEntry("classes" + i10 + ".dex");
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException e11) {
                Log.w("MultiDex", "Failed to close resource", e11);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f34535g.release();
        this.f34534f.close();
        this.f34533e.close();
    }

    /* renamed from: f */
    public final void m30560f() {
        File[] listFiles = this.f34532d.listFiles(new a(this));
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f34532d.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    /* renamed from: w */
    public List<? extends File> m30561w(Context context, String str, boolean z10) {
        List<b> list;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f34530b.getPath() + ", " + z10 + ", " + str + ")");
        if (!this.f34535g.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z10 && !m30558v(context, this.f34530b, this.f34531c, str)) {
            try {
                list = m30562y(context, str);
            } catch (IOException e10) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e10);
            }
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        Log.i("MultiDex", z10 ? "Forced extraction must be performed." : "Detected that extraction must be performed.");
        List<b> m30559B = m30559B();
        m30554o0(context, str, m30556q(this.f34530b), this.f34531c, m30559B);
        list = m30559B;
        Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
        return list;
    }

    /* renamed from: y */
    public final List<b> m30562y(Context context, String str) {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f34530b.getName() + ".classes";
        SharedPreferences m30555p = m30555p(context);
        int i10 = m30555p.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 - 1);
        for (int i11 = 2; i11 <= i10; i11++) {
            b bVar = new b(this.f34532d, str2 + i11 + ".zip");
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.f34537b = m30557t(bVar);
            long j10 = m30555p.getLong(str + "dex.crc." + i11, -1L);
            long j11 = m30555p.getLong(str + "dex.time." + i11, -1L);
            long lastModified = bVar.lastModified();
            if (j11 != lastModified || j10 != bVar.f34537b) {
                throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j11 + ", modification time: " + lastModified + ", expected crc: " + j10 + ", file crc: " + bVar.f34537b);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }
}

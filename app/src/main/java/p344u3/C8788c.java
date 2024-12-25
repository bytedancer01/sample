package p344u3;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:u3/c.class
 */
/* renamed from: u3.c */
/* loaded from: combined.jar:classes1.jar:u3/c.class */
public final class C8788c {

    /* renamed from: a */
    public static final Charset f40783a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f40784b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static void m37643a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
            }
        }
    }

    /* renamed from: b */
    public static void m37644b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                m37644b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}

package p089f2;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p071e2.AbstractC4582k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f2/h.class
 */
/* renamed from: f2.h */
/* loaded from: combined.jar:classes1.jar:f2/h.class */
public class C4758h {

    /* renamed from: a */
    public static final String f28040a = AbstractC4582k.m23128f("WrkDbPathHelper");

    /* renamed from: b */
    public static final String[] f28041b = {"-journal", "-shm", "-wal"};

    /* renamed from: a */
    public static File m24103a(Context context) {
        return Build.VERSION.SDK_INT < 23 ? m24104b(context) : m24105c(context, "androidx.work.workdb");
    }

    /* renamed from: b */
    public static File m24104b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    /* renamed from: c */
    public static File m24105c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    /* renamed from: d */
    public static String m24106d() {
        return "androidx.work.workdb";
    }

    /* renamed from: e */
    public static void m24107e(Context context) {
        File m24104b = m24104b(context);
        if (Build.VERSION.SDK_INT < 23 || !m24104b.exists()) {
            return;
        }
        AbstractC4582k.m23126c().mo23129a(f28040a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        Map<File, File> m24108f = m24108f(context);
        for (File file : m24108f.keySet()) {
            File file2 = m24108f.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    AbstractC4582k.m23126c().mo23133h(f28040a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                }
                AbstractC4582k.m23126c().mo23129a(f28040a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
            }
        }
    }

    /* renamed from: f */
    public static Map<File, File> m24108f(Context context) {
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            File m24104b = m24104b(context);
            File m24103a = m24103a(context);
            hashMap.put(m24104b, m24103a);
            for (String str : f28041b) {
                hashMap.put(new File(m24104b.getPath() + str), new File(m24103a.getPath() + str));
            }
        }
        return hashMap;
    }
}

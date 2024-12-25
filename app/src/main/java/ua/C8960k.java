package ua;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/k.class
 */
/* renamed from: ua.k */
/* loaded from: combined.jar:classes2.jar:ua/k.class */
public final class C8960k {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r0 == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ab  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m38097a(ua.C9128y3 r9, android.database.sqlite.SQLiteDatabase r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C8960k.m38097a(ua.y3, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* renamed from: b */
    public static void m38098b(C9128y3 c9128y3, SQLiteDatabase sQLiteDatabase) {
        if (c9128y3 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            c9128y3.m38411r().m38326a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c9128y3.m38411r().m38326a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c9128y3.m38411r().m38326a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c9128y3.m38411r().m38326a("Failed to turn on database write permission for owner");
    }
}

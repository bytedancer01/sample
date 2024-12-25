package cd;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cd/b.class
 */
/* renamed from: cd.b */
/* loaded from: combined.jar:classes2.jar:cd/b.class */
public class C1062b {

    /* renamed from: a */
    public final FileChannel f7075a;

    /* renamed from: b */
    public final FileLock f7076b;

    public C1062b(FileChannel fileChannel, FileLock fileLock) {
        this.f7075a = fileChannel;
        this.f7076b = fileLock;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static cd.C1062b m6275a(android.content.Context r5, java.lang.String r6) {
        /*
            java.io.File r0 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L48 java.lang.Error -> L4c java.io.IOException -> L50
            r7 = r0
            r0 = r7
            r1 = r5
            java.io.File r1 = r1.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L48 java.lang.Error -> L4c java.io.IOException -> L50
            r2 = r6
            r0.<init>(r1, r2)     // Catch: java.nio.channels.OverlappingFileLockException -> L48 java.lang.Error -> L4c java.io.IOException -> L50
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L48 java.lang.Error -> L4c java.io.IOException -> L50
            r5 = r0
            r0 = r5
            r1 = r7
            java.lang.String r2 = "rw"
            r0.<init>(r1, r2)     // Catch: java.nio.channels.OverlappingFileLockException -> L48 java.lang.Error -> L4c java.io.IOException -> L50
            r0 = r5
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L48 java.lang.Error -> L4c java.io.IOException -> L50
            r7 = r0
            r0 = r7
            java.nio.channels.FileLock r0 = r0.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L3a java.lang.Error -> L3e java.io.IOException -> L42
            r6 = r0
            cd.b r0 = new cd.b     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L36 java.nio.channels.OverlappingFileLockException -> L3a java.lang.Error -> L3e java.io.IOException -> L42
            r1 = r0
            r2 = r7
            r3 = r6
            r1.<init>(r2, r3)     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L36
            r5 = r0
            r0 = r5
            return r0
        L2e:
            r5 = move-exception
            goto L55
        L32:
            r5 = move-exception
            goto L55
        L36:
            r5 = move-exception
            goto L55
        L3a:
            r5 = move-exception
            goto L43
        L3e:
            r5 = move-exception
            goto L43
        L42:
            r5 = move-exception
        L43:
            r0 = 0
            r6 = r0
            goto L55
        L48:
            r5 = move-exception
            goto L51
        L4c:
            r5 = move-exception
            goto L51
        L50:
            r5 = move-exception
        L51:
            r0 = 0
            r7 = r0
            r0 = 0
            r6 = r0
        L55:
            java.lang.String r0 = "CrossProcessLock"
            java.lang.String r1 = "encountered error while creating and acquiring the lock, ignoring"
            r2 = r5
            int r0 = android.util.Log.e(r0, r1, r2)
            r0 = r6
            if (r0 == 0) goto L6a
            r0 = r6
            r0.release()     // Catch: java.io.IOException -> L69
            goto L6a
        L69:
            r5 = move-exception
        L6a:
            r0 = r7
            if (r0 == 0) goto L72
            r0 = r7
            r0.close()     // Catch: java.io.IOException -> L74
        L72:
            r0 = 0
            return r0
        L74:
            r5 = move-exception
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.C1062b.m6275a(android.content.Context, java.lang.String):cd.b");
    }

    /* renamed from: b */
    public void m6276b() {
        try {
            this.f7076b.release();
            this.f7075a.close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }
}

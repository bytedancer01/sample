package p360v1;

import android.database.Cursor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;
import p375w1.InterfaceC9397b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v1/c.class
 */
/* renamed from: v1.c */
/* loaded from: combined.jar:classes1.jar:v1/c.class */
public class C9225c {
    /* renamed from: a */
    public static void m38892a(InterfaceC9397b interfaceC9397b) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor mo39719p0 = interfaceC9397b.mo39719p0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (mo39719p0.moveToNext()) {
            try {
                arrayList.add(mo39719p0.getString(0));
            } catch (Throwable th2) {
                mo39719p0.close();
                throw th2;
            }
        }
        mo39719p0.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                interfaceC9397b.mo39713F("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r8 < r0) goto L14;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.database.Cursor m38893b(p327t1.AbstractC8597e r4, p375w1.InterfaceC9400e r5, boolean r6, android.os.CancellationSignal r7) {
        /*
            r0 = r4
            r1 = r5
            r2 = r7
            android.database.Cursor r0 = r0.m36909q(r1, r2)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r6
            if (r0 == 0) goto L4e
            r0 = r5
            r4 = r0
            r0 = r5
            boolean r0 = r0 instanceof android.database.AbstractWindowedCursor
            if (r0 == 0) goto L4e
            r0 = r5
            android.database.AbstractWindowedCursor r0 = (android.database.AbstractWindowedCursor) r0
            r7 = r0
            r0 = r7
            int r0 = r0.getCount()
            r9 = r0
            r0 = r7
            boolean r0 = r0.hasWindow()
            if (r0 == 0) goto L34
            r0 = r7
            android.database.CursorWindow r0 = r0.getWindow()
            int r0 = r0.getNumRows()
            r8 = r0
            goto L38
        L34:
            r0 = r9
            r8 = r0
        L38:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L49
            r0 = r5
            r4 = r0
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto L4e
        L49:
            r0 = r7
            android.database.Cursor r0 = p360v1.C9224b.m38890a(r0)
            r4 = r0
        L4e:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p360v1.C9225c.m38893b(t1.e, w1.e, boolean, android.os.CancellationSignal):android.database.Cursor");
    }

    /* renamed from: c */
    public static int m38894c(File file) {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i10 = allocate.getInt();
            channel.close();
            return i10;
        } catch (Throwable th2) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th2;
        }
    }
}

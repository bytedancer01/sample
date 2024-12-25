package p363v4;

import android.util.Log;
import java.util.Queue;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v4/a.class
 */
/* renamed from: v4.a */
/* loaded from: combined.jar:classes1.jar:v4/a.class */
public final class C9235a {

    /* renamed from: b */
    public static final C9235a f42221b = new C9235a();

    /* renamed from: a */
    public final Queue<byte[]> f42222a = C9242h.m38965c(0);

    /* renamed from: a */
    public static C9235a m38942a() {
        return f42221b;
    }

    /* renamed from: b */
    public byte[] m38943b() {
        byte[] poll;
        synchronized (this.f42222a) {
            poll = this.f42222a.poll();
        }
        byte[] bArr = poll;
        if (poll == null) {
            byte[] bArr2 = new byte[65536];
            bArr = bArr2;
            if (Log.isLoggable("ByteArrayPool", 3)) {
                Log.d("ByteArrayPool", "Created temp bytes");
                bArr = bArr2;
            }
        }
        return bArr;
    }

    /* renamed from: c */
    public boolean m38944c(byte[] bArr) {
        boolean z10 = false;
        if (bArr.length != 65536) {
            return false;
        }
        synchronized (this.f42222a) {
            if (this.f42222a.size() < 32) {
                z10 = true;
                this.f42222a.offer(bArr);
            }
        }
        return z10;
    }
}

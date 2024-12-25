package p360v1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v1/a.class
 */
/* renamed from: v1.a */
/* loaded from: combined.jar:classes1.jar:v1/a.class */
public class C9223a {

    /* renamed from: e */
    public static final Map<String, Lock> f42146e = new HashMap();

    /* renamed from: a */
    public final File f42147a;

    /* renamed from: b */
    public final Lock f42148b;

    /* renamed from: c */
    public final boolean f42149c;

    /* renamed from: d */
    public FileChannel f42150d;

    public C9223a(String str, File file, boolean z10) {
        File file2 = new File(file, str + ".lck");
        this.f42147a = file2;
        this.f42148b = m38887a(file2.getAbsolutePath());
        this.f42149c = z10;
    }

    /* renamed from: a */
    public static Lock m38887a(String str) {
        Lock lock;
        Map<String, Lock> map = f42146e;
        synchronized (map) {
            Lock lock2 = map.get(str);
            lock = lock2;
            if (lock2 == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    /* renamed from: b */
    public void m38888b() {
        this.f42148b.lock();
        if (this.f42149c) {
            try {
                FileChannel channel = new FileOutputStream(this.f42147a).getChannel();
                this.f42150d = channel;
                channel.lock();
            } catch (IOException e10) {
                throw new IllegalStateException("Unable to grab copy lock.", e10);
            }
        }
    }

    /* renamed from: c */
    public void m38889c() {
        FileChannel fileChannel = this.f42150d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException e10) {
            }
        }
        this.f42148b.unlock();
    }
}

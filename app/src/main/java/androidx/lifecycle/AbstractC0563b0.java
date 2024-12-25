package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/b0.class
 */
/* renamed from: androidx.lifecycle.b0 */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/b0.class */
public abstract class AbstractC0563b0 {

    /* renamed from: a */
    public final Map<String, Object> f3754a = new HashMap();

    /* renamed from: b */
    public volatile boolean f3755b = false;

    /* renamed from: b */
    public static void m3132b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: a */
    public final void m3133a() {
        this.f3755b = true;
        Map<String, Object> map = this.f3754a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f3754a.values().iterator();
                while (it.hasNext()) {
                    m3132b(it.next());
                }
            }
        }
        mo2287d();
    }

    /* renamed from: c */
    public <T> T m3134c(String str) {
        T t10;
        Map<String, Object> map = this.f3754a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = (T) this.f3754a.get(str);
        }
        return t10;
    }

    /* renamed from: d */
    public void mo2287d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public <T> T m3135e(String str, T t10) {
        Object obj;
        synchronized (this.f3754a) {
            obj = this.f3754a.get(str);
            if (obj == 0) {
                this.f3754a.put(str, t10);
            }
        }
        if (obj != 0) {
            t10 = obj;
        }
        if (this.f3755b) {
            m3132b(t10);
        }
        return t10;
    }
}

package p169jd;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jd/d.class
 */
/* renamed from: jd.d */
/* loaded from: combined.jar:classes2.jar:jd/d.class */
public class C5359d {

    /* renamed from: b */
    public static volatile C5359d f30675b;

    /* renamed from: a */
    public final Set<AbstractC5361f> f30676a = new HashSet();

    /* renamed from: a */
    public static C5359d m26659a() {
        C5359d c5359d = f30675b;
        C5359d c5359d2 = c5359d;
        if (c5359d == null) {
            synchronized (C5359d.class) {
                try {
                    C5359d c5359d3 = f30675b;
                    c5359d2 = c5359d3;
                    if (c5359d3 == null) {
                        c5359d2 = new C5359d();
                        f30675b = c5359d2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c5359d2;
    }

    /* renamed from: b */
    public Set<AbstractC5361f> m26660b() {
        Set<AbstractC5361f> unmodifiableSet;
        synchronized (this.f30676a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f30676a);
        }
        return unmodifiableSet;
    }
}

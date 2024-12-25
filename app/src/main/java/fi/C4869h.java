package fi;

import p172jh.C5392k;
import p172jh.C5393l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/h.class
 */
/* renamed from: fi.h */
/* loaded from: combined.jar:classes2.jar:fi/h.class */
public final class C4869h {

    /* renamed from: a */
    public static final boolean f28559a;

    static {
        Object m26741a;
        try {
            C5392k.a aVar = C5392k.f30764b;
            m26741a = C5392k.m26741a(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            C5392k.a aVar2 = C5392k.f30764b;
            m26741a = C5392k.m26741a(C5393l.m26745a(th2));
        }
        f28559a = C5392k.m26744d(m26741a);
    }

    /* renamed from: a */
    public static final boolean m24758a() {
        return f28559a;
    }
}

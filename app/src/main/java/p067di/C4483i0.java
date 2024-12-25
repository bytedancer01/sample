package p067di;

import fi.C4866e;
import org.jetbrains.annotations.NotNull;
import p172jh.C5392k;
import p172jh.C5393l;
import p233nh.InterfaceC6789d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/i0.class
 */
/* renamed from: di.i0 */
/* loaded from: combined.jar:classes2.jar:di/i0.class */
public final class C4483i0 {
    @NotNull
    /* renamed from: a */
    public static final String m22670a(@NotNull Object obj) {
        return obj.getClass().getSimpleName();
    }

    @NotNull
    /* renamed from: b */
    public static final String m22671b(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    /* renamed from: c */
    public static final String m22672c(@NotNull InterfaceC6789d<?> interfaceC6789d) {
        Object m26741a;
        String str;
        if (interfaceC6789d instanceof C4866e) {
            str = interfaceC6789d.toString();
        } else {
            try {
                C5392k.a aVar = C5392k.f30764b;
                m26741a = C5392k.m26741a(interfaceC6789d + '@' + m22671b(interfaceC6789d));
            } catch (Throwable th2) {
                C5392k.a aVar2 = C5392k.f30764b;
                m26741a = C5392k.m26741a(C5393l.m26745a(th2));
            }
            if (C5392k.m26742b(m26741a) != null) {
                m26741a = ((Object) interfaceC6789d.getClass().getName()) + '@' + m22671b(interfaceC6789d);
            }
            str = (String) m26741a;
        }
        return str;
    }
}

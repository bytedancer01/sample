package fi;

import bi.C0909g;
import bi.C0911i;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import org.jetbrains.annotations.NotNull;
import p067di.AbstractC4496m1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/n.class
 */
/* renamed from: fi.n */
/* loaded from: combined.jar:classes2.jar:fi/n.class */
public final class C4875n {

    /* renamed from: a */
    @NotNull
    public static final C4875n f28577a;

    /* renamed from: b */
    public static final boolean f28578b;

    /* renamed from: c */
    @NotNull
    public static final AbstractC4496m1 f28579c;

    static {
        C4875n c4875n = new C4875n();
        f28577a = c4875n;
        f28578b = C4882u.m24806e("kotlinx.coroutines.fast.service.loader", true);
        f28579c = c4875n.m24794a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [di.m1] */
    /* renamed from: a */
    public final AbstractC4496m1 m24794a() {
        C4877p m24796b;
        Object next;
        try {
            List<MainDispatcherFactory> m24754c = f28578b ? C4868g.f28558a.m24754c() : C0911i.m5597j(C0909g.m5588a(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
            Iterator it = m24754c.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    Object obj = next;
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        next = obj;
                        int i10 = loadPriority;
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            i10 = loadPriority2;
                        }
                        obj = next;
                        loadPriority = i10;
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            m24796b = mainDispatcherFactory == null ? C4876o.m24796b(null, null, 3, null) : C4876o.m24798d(mainDispatcherFactory, m24754c);
        } catch (Throwable th2) {
            m24796b = C4876o.m24796b(th2, null, 2, null);
        }
        return m24796b;
    }
}

package fi;

import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import org.jetbrains.annotations.NotNull;
import p067di.AbstractC4496m1;
import p172jh.C5384c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/o.class
 */
/* renamed from: fi.o */
/* loaded from: combined.jar:classes2.jar:fi/o.class */
public final class C4876o {

    /* renamed from: a */
    public static final boolean f28580a = true;

    /* renamed from: a */
    public static final C4877p m24795a(Throwable th2, String str) {
        if (f28580a) {
            return new C4877p(th2, str);
        }
        if (th2 != null) {
            throw th2;
        }
        m24797c();
        throw new C5384c();
    }

    /* renamed from: b */
    public static /* synthetic */ C4877p m24796b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return m24795a(th2, str);
    }

    @NotNull
    /* renamed from: c */
    public static final Void m24797c() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @NotNull
    /* renamed from: d */
    public static final AbstractC4496m1 m24798d(@NotNull MainDispatcherFactory mainDispatcherFactory, @NotNull List<? extends MainDispatcherFactory> list) {
        AbstractC4496m1 m24795a;
        try {
            m24795a = mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th2) {
            m24795a = m24795a(th2, mainDispatcherFactory.hintOnError());
        }
        return m24795a;
    }
}

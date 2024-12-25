package p067di;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5392k;
import p172jh.C5393l;
import p172jh.C5398q;
import p233nh.InterfaceC6789d;
import p356uh.InterfaceC9196l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/z.class
 */
/* renamed from: di.z */
/* loaded from: combined.jar:classes2.jar:di/z.class */
public final class C4532z {
    @NotNull
    /* renamed from: a */
    public static final <T> Object m22849a(@Nullable Object obj, @NotNull InterfaceC6789d<? super T> interfaceC6789d) {
        Object obj2 = obj;
        if (obj instanceof C4521v) {
            C5392k.a aVar = C5392k.f30764b;
            obj2 = C5393l.m26745a(((C4521v) obj).f26946a);
        }
        return C5392k.m26741a(obj2);
    }

    @Nullable
    /* renamed from: b */
    public static final <T> Object m22850b(@NotNull Object obj, @NotNull InterfaceC4485j<?> interfaceC4485j) {
        Throwable m26742b = C5392k.m26742b(obj);
        if (m26742b != null) {
            obj = new C4521v(m26742b, false, 2, null);
        }
        return obj;
    }

    @Nullable
    /* renamed from: c */
    public static final <T> Object m22851c(@NotNull Object obj, @Nullable InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l) {
        Object c4521v;
        Throwable m26742b = C5392k.m26742b(obj);
        if (m26742b == null) {
            c4521v = obj;
            if (interfaceC9196l != null) {
                c4521v = new C4524w(obj, interfaceC9196l);
            }
        } else {
            c4521v = new C4521v(m26742b, false, 2, null);
        }
        return c4521v;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m22852d(Object obj, InterfaceC9196l interfaceC9196l, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            interfaceC9196l = null;
        }
        return m22851c(obj, interfaceC9196l);
    }
}

package p305ra;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/y5.class
 */
/* renamed from: ra.y5 */
/* loaded from: combined.jar:classes2.jar:ra/y5.class */
public final class C8425y5 {

    /* renamed from: b */
    public static volatile C8425y5 f39411b;

    /* renamed from: c */
    public static volatile C8425y5 f39412c;

    /* renamed from: d */
    public static final C8425y5 f39413d = new C8425y5(true);

    /* renamed from: a */
    public final Map<C8410x5, C8216k6<?, ?>> f39414a;

    public C8425y5() {
        this.f39414a = new HashMap();
    }

    public C8425y5(boolean z10) {
        this.f39414a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C8425y5 m36226a() {
        C8425y5 c8425y5 = f39411b;
        C8425y5 c8425y52 = c8425y5;
        if (c8425y5 == null) {
            synchronized (C8425y5.class) {
                try {
                    C8425y5 c8425y53 = f39411b;
                    c8425y52 = c8425y53;
                    if (c8425y53 == null) {
                        c8425y52 = f39413d;
                        f39411b = c8425y52;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c8425y52;
    }

    /* renamed from: b */
    public static C8425y5 m36227b() {
        C8425y5 c8425y5 = f39412c;
        if (c8425y5 != null) {
            return c8425y5;
        }
        synchronized (C8425y5.class) {
            try {
                C8425y5 c8425y52 = f39412c;
                if (c8425y52 != null) {
                    return c8425y52;
                }
                C8425y5 m35385b = AbstractC8156g6.m35385b(C8425y5.class);
                f39412c = m35385b;
                return m35385b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final <ContainingType extends InterfaceC8307q7> C8216k6<ContainingType, ?> m36228c(ContainingType containingtype, int i10) {
        return (C8216k6) this.f39414a.get(new C8410x5(containingtype, i10));
    }
}

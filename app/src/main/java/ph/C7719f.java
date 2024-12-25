package ph;

import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ph/f.class
 */
/* renamed from: ph.f */
/* loaded from: combined.jar:classes2.jar:ph/f.class */
public final class C7719f {
    /* renamed from: a */
    public static final void m33714a(int i10, int i11) {
        if (i11 <= i10) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i10 + ", got " + i11 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    public static final InterfaceC7718e m33715b(AbstractC7714a abstractC7714a) {
        return (InterfaceC7718e) abstractC7714a.getClass().getAnnotation(InterfaceC7718e.class);
    }

    /* renamed from: c */
    public static final int m33716c(AbstractC7714a abstractC7714a) {
        int i10;
        try {
            Field declaredField = abstractC7714a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC7714a);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i10 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception e10) {
            i10 = -1;
        }
        return i10;
    }

    @Nullable
    /* renamed from: d */
    public static final StackTraceElement m33717d(@NotNull AbstractC7714a abstractC7714a) {
        String str;
        C9367f.m39526e(abstractC7714a, "<this>");
        InterfaceC7718e m33715b = m33715b(abstractC7714a);
        if (m33715b == null) {
            return null;
        }
        m33714a(1, m33715b.m33713v());
        int m33716c = m33716c(abstractC7714a);
        int i10 = m33716c < 0 ? -1 : m33715b.m33711l()[m33716c];
        String m33722b = C7721h.f37483a.m33722b(abstractC7714a);
        if (m33722b == null) {
            str = m33715b.m33709c();
        } else {
            str = m33722b + '/' + m33715b.m33709c();
        }
        return new StackTraceElement(str, m33715b.m33712m(), m33715b.m33710f(), i10);
    }
}

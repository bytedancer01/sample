package ci;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p356uh.InterfaceC9196l;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ci/f.class
 */
/* renamed from: ci.f */
/* loaded from: combined.jar:classes2.jar:ci/f.class */
public class C1120f {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> void m6705a(@NotNull Appendable appendable, T t10, @Nullable InterfaceC9196l<? super T, ? extends CharSequence> interfaceC9196l) {
        CharSequence valueOf;
        CharSequence charSequence;
        C9367f.m39526e(appendable, "<this>");
        if (interfaceC9196l != null) {
            charSequence = (T) interfaceC9196l.mo6711d(t10);
        } else {
            boolean z10 = t10 == 0 ? true : t10 instanceof CharSequence;
            charSequence = t10;
            if (!z10) {
                if (t10 instanceof Character) {
                    appendable.append(((Character) t10).charValue());
                    return;
                } else {
                    valueOf = String.valueOf(t10);
                    appendable.append(valueOf);
                }
            }
        }
        valueOf = charSequence;
        appendable.append(valueOf);
    }
}

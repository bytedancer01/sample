package bi;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bi/g.class
 */
/* renamed from: bi.g */
/* loaded from: combined.jar:classes2.jar:bi/g.class */
public class C0909g extends C0908f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:bi/g$a.class
     */
    /* renamed from: bi.g$a */
    /* loaded from: combined.jar:classes2.jar:bi/g$a.class */
    public static final class a<T> implements InterfaceC0906d<T> {

        /* renamed from: a */
        public final Iterator f6057a;

        public a(Iterator it) {
            this.f6057a = it;
        }

        @Override // bi.InterfaceC0906d
        @NotNull
        public Iterator<T> iterator() {
            return this.f6057a;
        }
    }

    @NotNull
    /* renamed from: a */
    public static final <T> InterfaceC0906d<T> m5588a(@NotNull Iterator<? extends T> it) {
        C9367f.m39526e(it, "<this>");
        return m5589b(new a(it));
    }

    @NotNull
    /* renamed from: b */
    public static final <T> InterfaceC0906d<T> m5589b(@NotNull InterfaceC0906d<? extends T> interfaceC0906d) {
        C9367f.m39526e(interfaceC0906d, "<this>");
        if (!(interfaceC0906d instanceof C0903a)) {
            interfaceC0906d = new C0903a(interfaceC0906d);
        }
        return (InterfaceC0906d<T>) interfaceC0906d;
    }
}

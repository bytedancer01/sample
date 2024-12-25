package p172jh;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p356uh.InterfaceC9185a;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jh/m.class
 */
/* renamed from: jh.m */
/* loaded from: combined.jar:classes2.jar:jh/m.class */
public final class C5394m<T> implements InterfaceC5388g<T>, Serializable {

    /* renamed from: b */
    @Nullable
    public InterfaceC9185a<? extends T> f30766b;

    /* renamed from: c */
    @Nullable
    public volatile Object f30767c;

    /* renamed from: d */
    @NotNull
    public final Object f30768d;

    public C5394m(@NotNull InterfaceC9185a<? extends T> interfaceC9185a, @Nullable Object obj) {
        C9367f.m39526e(interfaceC9185a, "initializer");
        this.f30766b = interfaceC9185a;
        this.f30767c = C5396o.f30769a;
        this.f30768d = obj == null ? this : obj;
    }

    public /* synthetic */ C5394m(InterfaceC9185a interfaceC9185a, Object obj, int i10, C9365d c9365d) {
        this(interfaceC9185a, (i10 & 2) != 0 ? null : obj);
    }

    /* renamed from: a */
    public boolean m26747a() {
        return this.f30767c != C5396o.f30769a;
    }

    @Override // p172jh.InterfaceC5388g
    public T getValue() {
        Object obj;
        T t10 = (T) this.f30767c;
        Object obj2 = C5396o.f30769a;
        if (t10 != obj2) {
            return t10;
        }
        synchronized (this.f30768d) {
            obj = this.f30767c;
            if (obj == obj2) {
                InterfaceC9185a<? extends T> interfaceC9185a = this.f30766b;
                C9367f.m39524c(interfaceC9185a);
                obj = (T) interfaceC9185a.mo20777h();
                this.f30767c = obj;
                this.f30766b = null;
            }
        }
        return (T) obj;
    }

    @NotNull
    public String toString() {
        return m26747a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

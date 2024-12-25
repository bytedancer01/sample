package fi;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p313s.C8490b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/l.class
 */
/* renamed from: fi.l */
/* loaded from: combined.jar:classes2.jar:fi/l.class */
public class C4873l<E> {

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f28567a = AtomicReferenceFieldUpdater.newUpdater(C4873l.class, Object.class, "_cur");

    @NotNull
    private volatile Object _cur;

    public C4873l(boolean z10) {
        this._cur = new C4874m(8, z10);
    }

    /* renamed from: a */
    public final boolean m24775a(@NotNull E e10) {
        while (true) {
            C4874m c4874m = (C4874m) this._cur;
            int m24779a = c4874m.m24779a(e10);
            if (m24779a == 0) {
                return true;
            }
            if (m24779a == 1) {
                C8490b.m36639a(f28567a, this, c4874m, c4874m.m24787i());
            } else if (m24779a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m24776b() {
        while (true) {
            C4874m c4874m = (C4874m) this._cur;
            if (c4874m.m24782d()) {
                return;
            } else {
                C8490b.m36639a(f28567a, this, c4874m, c4874m.m24787i());
            }
        }
    }

    /* renamed from: c */
    public final int m24777c() {
        return ((C4874m) this._cur).m24784f();
    }

    @Nullable
    /* renamed from: d */
    public final E m24778d() {
        while (true) {
            C4874m c4874m = (C4874m) this._cur;
            E e10 = (E) c4874m.m24788j();
            if (e10 != C4874m.f28571h) {
                return e10;
            }
            C8490b.m36639a(f28567a, this, c4874m, c4874m.m24787i());
        }
    }
}

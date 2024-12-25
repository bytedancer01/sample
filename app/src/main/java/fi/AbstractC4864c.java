package fi;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p313s.C8490b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/c.class
 */
/* renamed from: fi.c */
/* loaded from: combined.jar:classes2.jar:fi/c.class */
public abstract class AbstractC4864c<T> extends AbstractC4878q {

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f28549a = AtomicReferenceFieldUpdater.newUpdater(AbstractC4864c.class, Object.class, "_consensus");

    @NotNull
    private volatile Object _consensus = C4863b.f28547a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fi.AbstractC4878q
    @NotNull
    /* renamed from: a */
    public AbstractC4864c<?> mo24738a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fi.AbstractC4878q
    @Nullable
    /* renamed from: c */
    public final Object mo24739c(@Nullable Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = obj2;
        if (obj2 == C4863b.f28547a) {
            obj3 = m24741e(mo22740g(obj));
        }
        mo24740d(obj, obj3);
        return obj3;
    }

    /* renamed from: d */
    public abstract void mo24740d(T t10, @Nullable Object obj);

    @Nullable
    /* renamed from: e */
    public final Object m24741e(@Nullable Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C4863b.f28547a;
        return obj2 != obj3 ? obj2 : C8490b.m36639a(f28549a, this, obj3, obj) ? obj : this._consensus;
    }

    /* renamed from: f */
    public long m24742f() {
        return 0L;
    }

    @Nullable
    /* renamed from: g */
    public abstract Object mo22740g(T t10);
}

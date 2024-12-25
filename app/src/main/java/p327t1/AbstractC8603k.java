package p327t1;

import java.util.concurrent.atomic.AtomicBoolean;
import p375w1.InterfaceC9401f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t1/k.class
 */
/* renamed from: t1.k */
/* loaded from: combined.jar:classes1.jar:t1/k.class */
public abstract class AbstractC8603k {

    /* renamed from: a */
    public final AtomicBoolean f40132a = new AtomicBoolean(false);

    /* renamed from: b */
    public final AbstractC8597e f40133b;

    /* renamed from: c */
    public volatile InterfaceC9401f f40134c;

    public AbstractC8603k(AbstractC8597e abstractC8597e) {
        this.f40133b = abstractC8597e;
    }

    /* renamed from: a */
    public InterfaceC9401f m36949a() {
        m36950b();
        return m36952e(this.f40132a.compareAndSet(false, true));
    }

    /* renamed from: b */
    public void m36950b() {
        this.f40133b.m36896a();
    }

    /* renamed from: c */
    public final InterfaceC9401f m36951c() {
        return this.f40133b.m36899d(mo30570d());
    }

    /* renamed from: d */
    public abstract String mo30570d();

    /* renamed from: e */
    public final InterfaceC9401f m36952e(boolean z10) {
        InterfaceC9401f m36951c;
        if (z10) {
            if (this.f40134c == null) {
                this.f40134c = m36951c();
            }
            m36951c = this.f40134c;
        } else {
            m36951c = m36951c();
        }
        return m36951c;
    }

    /* renamed from: f */
    public void m36953f(InterfaceC9401f interfaceC9401f) {
        if (interfaceC9401f == this.f40134c) {
            this.f40132a.set(false);
        }
    }
}

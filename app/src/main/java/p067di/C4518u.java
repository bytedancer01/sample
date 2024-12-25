package p067di;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5398q;
import p356uh.InterfaceC9196l;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/u.class
 */
/* renamed from: di.u */
/* loaded from: combined.jar:classes2.jar:di/u.class */
public final class C4518u {

    /* renamed from: a */
    @Nullable
    public final Object f26937a;

    /* renamed from: b */
    @Nullable
    public final AbstractC4479h f26938b;

    /* renamed from: c */
    @Nullable
    public final InterfaceC9196l<Throwable, C5398q> f26939c;

    /* renamed from: d */
    @Nullable
    public final Object f26940d;

    /* renamed from: e */
    @Nullable
    public final Throwable f26941e;

    /* JADX WARN: Multi-variable type inference failed */
    public C4518u(@Nullable Object obj, @Nullable AbstractC4479h abstractC4479h, @Nullable InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l, @Nullable Object obj2, @Nullable Throwable th2) {
        this.f26937a = obj;
        this.f26938b = abstractC4479h;
        this.f26939c = interfaceC9196l;
        this.f26940d = obj2;
        this.f26941e = th2;
    }

    public /* synthetic */ C4518u(Object obj, AbstractC4479h abstractC4479h, InterfaceC9196l interfaceC9196l, Object obj2, Throwable th2, int i10, C9365d c9365d) {
        this(obj, (i10 & 2) != 0 ? null : abstractC4479h, (i10 & 4) != 0 ? null : interfaceC9196l, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }

    /* renamed from: b */
    public static /* synthetic */ C4518u m22838b(C4518u c4518u, Object obj, AbstractC4479h abstractC4479h, InterfaceC9196l interfaceC9196l, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = c4518u.f26937a;
        }
        if ((i10 & 2) != 0) {
            abstractC4479h = c4518u.f26938b;
        }
        if ((i10 & 4) != 0) {
            interfaceC9196l = c4518u.f26939c;
        }
        if ((i10 & 8) != 0) {
            obj2 = c4518u.f26940d;
        }
        if ((i10 & 16) != 0) {
            th2 = c4518u.f26941e;
        }
        return c4518u.m22839a(obj, abstractC4479h, interfaceC9196l, obj2, th2);
    }

    @NotNull
    /* renamed from: a */
    public final C4518u m22839a(@Nullable Object obj, @Nullable AbstractC4479h abstractC4479h, @Nullable InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l, @Nullable Object obj2, @Nullable Throwable th2) {
        return new C4518u(obj, abstractC4479h, interfaceC9196l, obj2, th2);
    }

    /* renamed from: c */
    public final boolean m22840c() {
        return this.f26941e != null;
    }

    /* renamed from: d */
    public final void m22841d(@NotNull C4488k<?> c4488k, @NotNull Throwable th2) {
        AbstractC4479h abstractC4479h = this.f26938b;
        if (abstractC4479h != null) {
            c4488k.m22758l(abstractC4479h, th2);
        }
        InterfaceC9196l<Throwable, C5398q> interfaceC9196l = this.f26939c;
        if (interfaceC9196l == null) {
            return;
        }
        c4488k.m22760n(interfaceC9196l, th2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4518u)) {
            return false;
        }
        C4518u c4518u = (C4518u) obj;
        return C9367f.m39522a(this.f26937a, c4518u.f26937a) && C9367f.m39522a(this.f26938b, c4518u.f26938b) && C9367f.m39522a(this.f26939c, c4518u.f26939c) && C9367f.m39522a(this.f26940d, c4518u.f26940d) && C9367f.m39522a(this.f26941e, c4518u.f26941e);
    }

    public int hashCode() {
        Object obj = this.f26937a;
        int i10 = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        AbstractC4479h abstractC4479h = this.f26938b;
        int hashCode2 = abstractC4479h == null ? 0 : abstractC4479h.hashCode();
        InterfaceC9196l<Throwable, C5398q> interfaceC9196l = this.f26939c;
        int hashCode3 = interfaceC9196l == null ? 0 : interfaceC9196l.hashCode();
        Object obj2 = this.f26940d;
        int hashCode4 = obj2 == null ? 0 : obj2.hashCode();
        Throwable th2 = this.f26941e;
        if (th2 != null) {
            i10 = th2.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i10;
    }

    @NotNull
    public String toString() {
        return "CompletedContinuation(result=" + this.f26937a + ", cancelHandler=" + this.f26938b + ", onCancellation=" + this.f26939c + ", idempotentResume=" + this.f26940d + ", cancelCause=" + this.f26941e + ')';
    }
}

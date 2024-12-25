package p067di;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233nh.InterfaceC6789d;
import p233nh.InterfaceC6792g;
import p356uh.InterfaceC9200p;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/a.class
 */
/* renamed from: di.a */
/* loaded from: combined.jar:classes2.jar:di/a.class */
public abstract class AbstractC4458a<T> extends C4487j1 implements InterfaceC6789d<T>, InterfaceC4471e0 {

    /* renamed from: c */
    @NotNull
    public final InterfaceC6792g f26871c;

    public AbstractC4458a(@NotNull InterfaceC6792g interfaceC6792g, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            m22694N((InterfaceC4466c1) interfaceC6792g.get(InterfaceC4466c1.f26879b0));
        }
        this.f26871c = interfaceC6792g.plus(this);
    }

    @Override // p067di.C4487j1
    /* renamed from: M */
    public final void mo22616M(@NotNull Throwable th2) {
        C4468d0.m22650a(this.f26871c, th2);
    }

    @Override // p067di.C4487j1
    @NotNull
    /* renamed from: T */
    public String mo22617T() {
        String m22627b = C4459a0.m22627b(this.f26871c);
        if (m22627b == null) {
            return super.mo22617T();
        }
        return '\"' + m22627b + "\":" + super.mo22617T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067di.C4487j1
    /* renamed from: Y */
    public final void mo22618Y(@Nullable Object obj) {
        if (!(obj instanceof C4521v)) {
            m22623r0(obj);
        } else {
            C4521v c4521v = (C4521v) obj;
            m22622q0(c4521v.f26946a, c4521v.m22844a());
        }
    }

    @Override // p233nh.InterfaceC6789d
    @NotNull
    /* renamed from: b */
    public final InterfaceC6792g mo22619b() {
        return this.f26871c;
    }

    @Override // p233nh.InterfaceC6789d
    /* renamed from: c */
    public final void mo22620c(@NotNull Object obj) {
        Object m22698R = m22698R(C4532z.m22852d(obj, null, 1, null));
        if (m22698R == C4490k1.f26905b) {
            return;
        }
        mo22621p0(m22698R);
    }

    @Override // p067di.InterfaceC4471e0
    @NotNull
    /* renamed from: i */
    public InterfaceC6792g mo3093i() {
        return this.f26871c;
    }

    @Override // p067di.C4487j1, p067di.InterfaceC4466c1
    public boolean isActive() {
        return super.isActive();
    }

    /* renamed from: p0 */
    public void mo22621p0(@Nullable Object obj) {
        mo22716k(obj);
    }

    /* renamed from: q0 */
    public void m22622q0(@NotNull Throwable th2, boolean z10) {
    }

    /* renamed from: r0 */
    public void m22623r0(T t10) {
    }

    /* renamed from: s0 */
    public final <R> void m22624s0(@NotNull EnumC4477g0 enumC4477g0, R r10, @NotNull InterfaceC9200p<? super R, ? super InterfaceC6789d<? super T>, ? extends Object> interfaceC9200p) {
        enumC4477g0.invoke(interfaceC9200p, r10, this);
    }

    @Override // p067di.C4487j1
    @NotNull
    /* renamed from: u */
    public String mo22625u() {
        return C9367f.m39532k(C4483i0.m22670a(this), " was cancelled");
    }
}

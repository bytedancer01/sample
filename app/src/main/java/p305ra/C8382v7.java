package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/v7.class
 */
/* renamed from: ra.v7 */
/* loaded from: combined.jar:classes2.jar:ra/v7.class */
public final class C8382v7<T> implements InterfaceC8098c8<T> {

    /* renamed from: a */
    public final InterfaceC8307q7 f39344a;

    /* renamed from: b */
    public final AbstractC8308q8<?, ?> f39345b;

    /* renamed from: c */
    public final boolean f39346c;

    /* renamed from: d */
    public final AbstractC8440z5<?> f39347d;

    public C8382v7(AbstractC8308q8<?, ?> abstractC8308q8, AbstractC8440z5<?> abstractC8440z5, InterfaceC8307q7 interfaceC8307q7) {
        this.f39345b = abstractC8308q8;
        this.f39346c = abstractC8440z5.mo34996a(interfaceC8307q7);
        this.f39347d = abstractC8440z5;
        this.f39344a = interfaceC8307q7;
    }

    /* renamed from: i */
    public static <T> C8382v7<T> m35967i(AbstractC8308q8<?, ?> abstractC8308q8, AbstractC8440z5<?> abstractC8440z5, InterfaceC8307q7 interfaceC8307q7) {
        return new C8382v7<>(abstractC8308q8, abstractC8440z5, interfaceC8307q7);
    }

    @Override // p305ra.InterfaceC8098c8
    /* renamed from: a */
    public final int mo35096a(T t10) {
        AbstractC8308q8<?, ?> abstractC8308q8 = this.f39345b;
        int mo35739g = abstractC8308q8.mo35739g(abstractC8308q8.mo35736d(t10));
        if (!this.f39346c) {
            return mo35739g;
        }
        this.f39347d.mo34997b(t10);
        throw null;
    }

    @Override // p305ra.InterfaceC8098c8
    /* renamed from: b */
    public final void mo35097b(T t10, C8365u5 c8365u5) {
        this.f39347d.mo34997b(t10);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p305ra.InterfaceC8098c8
    /* renamed from: c */
    public final void mo35098c(T t10, byte[] bArr, int i10, int i11, C8394w4 c8394w4) {
        AbstractC8231l6 abstractC8231l6 = (AbstractC8231l6) t10;
        if (abstractC8231l6.zzc == C8323r8.m35762a()) {
            abstractC8231l6.zzc = C8323r8.m35763b();
        }
        throw null;
    }

    @Override // p305ra.InterfaceC8098c8
    /* renamed from: d */
    public final int mo35099d(T t10) {
        int hashCode = this.f39345b.mo35736d(t10).hashCode();
        if (!this.f39346c) {
            return hashCode;
        }
        this.f39347d.mo34997b(t10);
        throw null;
    }

    @Override // p305ra.InterfaceC8098c8
    /* renamed from: e */
    public final void mo35100e(T t10, T t11) {
        C8128e8.m35300f(this.f39345b, t10, t11);
        if (this.f39346c) {
            C8128e8.m35299e(this.f39347d, t10, t11);
        }
    }

    @Override // p305ra.InterfaceC8098c8
    /* renamed from: f */
    public final boolean mo35101f(T t10) {
        this.f39347d.mo34997b(t10);
        throw null;
    }

    @Override // p305ra.InterfaceC8098c8
    /* renamed from: g */
    public final void mo35102g(T t10) {
        this.f39345b.mo35737e(t10);
        this.f39347d.mo34998c(t10);
    }

    @Override // p305ra.InterfaceC8098c8
    /* renamed from: h */
    public final boolean mo35103h(T t10, T t11) {
        if (!this.f39345b.mo35736d(t10).equals(this.f39345b.mo35736d(t11))) {
            return false;
        }
        if (!this.f39346c) {
            return true;
        }
        this.f39347d.mo34997b(t10);
        this.f39347d.mo34997b(t11);
        throw null;
    }

    @Override // p305ra.InterfaceC8098c8
    public final T zza() {
        return (T) this.f39344a.mo35583a().mo35451t();
    }
}

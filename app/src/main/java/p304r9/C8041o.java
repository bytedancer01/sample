package p304r9;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/o.class
 */
/* renamed from: r9.o */
/* loaded from: combined.jar:classes2.jar:r9/o.class */
public final class C8041o implements InterfaceC8054v {

    /* renamed from: a */
    public final InterfaceC8054v f38843a;

    /* renamed from: b */
    public final C8049s f38844b;

    public C8041o(C8049s c8049s, InterfaceC8054v interfaceC8054v) {
        this.f38844b = c8049s;
        this.f38843a = interfaceC8054v;
    }

    @Override // p304r9.InterfaceC8054v
    /* renamed from: a */
    public final void mo30962a(long j10) {
        InterfaceC8054v interfaceC8054v = this.f38843a;
        if (interfaceC8054v != null) {
            interfaceC8054v.mo30962a(j10);
        }
    }

    @Override // p304r9.InterfaceC8054v
    /* renamed from: b */
    public final void mo30963b(long j10, int i10, Object obj) {
        int i11;
        InterfaceC8043p interfaceC8043p;
        if (this.f38843a != null) {
            int i12 = i10;
            if (i10 == 2001) {
                C8049s c8049s = this.f38844b;
                C8015b c8015b = c8049s.f38820a;
                i11 = c8049s.f38890i;
                c8015b.m34878f("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", Integer.valueOf(i11));
                interfaceC8043p = this.f38844b.f38889h;
                interfaceC8043p.mo31055f();
                i12 = 2001;
            }
            this.f38843a.mo30963b(j10, i12, obj);
        }
    }
}

package p042cj;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: cj.h */
/* loaded from: combined.jar:classes3.jar:cj/h.class */
public class C1139h extends AbstractC1135d {

    /* renamed from: j */
    public final C1140i f7499j;

    public C1139h(boolean z10, C1140i c1140i) {
        this.f7484a = z10;
        this.f7499j = c1140i;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f7485b = c1140i.m6794t(allocate, 16L);
        this.f7486c = c1140i.m6795v(allocate, 32L);
        this.f7487d = c1140i.m6795v(allocate, 40L);
        this.f7488e = c1140i.m6794t(allocate, 54L);
        this.f7489f = c1140i.m6794t(allocate, 56L);
        this.f7490g = c1140i.m6794t(allocate, 58L);
        this.f7491h = c1140i.m6794t(allocate, 60L);
        this.f7492i = c1140i.m6794t(allocate, 62L);
    }

    @Override // p042cj.AbstractC1135d
    /* renamed from: a */
    public AbstractC1134c mo6786a(long j10, int i10) {
        return new C1133b(this.f7499j, this, j10, i10);
    }

    @Override // p042cj.AbstractC1135d
    /* renamed from: b */
    public AbstractC1136e mo6787b(long j10) {
        return new C1142k(this.f7499j, this, j10);
    }

    @Override // p042cj.AbstractC1135d
    /* renamed from: c */
    public AbstractC1137f mo6788c(int i10) {
        return new C1144m(this.f7499j, this, i10);
    }
}

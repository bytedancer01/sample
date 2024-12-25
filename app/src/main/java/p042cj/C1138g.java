package p042cj;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: cj.g */
/* loaded from: combined.jar:classes3.jar:cj/g.class */
public class C1138g extends AbstractC1135d {

    /* renamed from: j */
    public final C1140i f7498j;

    public C1138g(boolean z10, C1140i c1140i) {
        this.f7484a = z10;
        this.f7498j = c1140i;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f7485b = c1140i.m6794t(allocate, 16L);
        this.f7486c = c1140i.m6797y(allocate, 28L);
        this.f7487d = c1140i.m6797y(allocate, 32L);
        this.f7488e = c1140i.m6794t(allocate, 42L);
        this.f7489f = c1140i.m6794t(allocate, 44L);
        this.f7490g = c1140i.m6794t(allocate, 46L);
        this.f7491h = c1140i.m6794t(allocate, 48L);
        this.f7492i = c1140i.m6794t(allocate, 50L);
    }

    @Override // p042cj.AbstractC1135d
    /* renamed from: a */
    public AbstractC1134c mo6786a(long j10, int i10) {
        return new C1132a(this.f7498j, this, j10, i10);
    }

    @Override // p042cj.AbstractC1135d
    /* renamed from: b */
    public AbstractC1136e mo6787b(long j10) {
        return new C1141j(this.f7498j, this, j10);
    }

    @Override // p042cj.AbstractC1135d
    /* renamed from: c */
    public AbstractC1137f mo6788c(int i10) {
        return new C1143l(this.f7498j, this, i10);
    }
}

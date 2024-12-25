package p042cj;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: cj.j */
/* loaded from: combined.jar:classes3.jar:cj/j.class */
public class C1141j extends AbstractC1136e {
    public C1141j(C1140i c1140i, AbstractC1135d abstractC1135d, long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(abstractC1135d.f7484a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = abstractC1135d.f7486c + (j10 * abstractC1135d.f7488e);
        this.f7493a = c1140i.m6797y(allocate, j11);
        this.f7494b = c1140i.m6797y(allocate, 4 + j11);
        this.f7495c = c1140i.m6797y(allocate, 8 + j11);
        this.f7496d = c1140i.m6797y(allocate, j11 + 20);
    }
}

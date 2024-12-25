package p042cj;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: cj.a */
/* loaded from: combined.jar:classes3.jar:cj/a.class */
public class C1132a extends AbstractC1134c {
    public C1132a(C1140i c1140i, AbstractC1135d abstractC1135d, long j10, int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(abstractC1135d.f7484a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = j10 + (i10 * 8);
        this.f7482a = c1140i.m6797y(allocate, j11);
        this.f7483b = c1140i.m6797y(allocate, j11 + 4);
    }
}

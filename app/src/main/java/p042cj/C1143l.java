package p042cj;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: cj.l */
/* loaded from: combined.jar:classes3.jar:cj/l.class */
public class C1143l extends AbstractC1137f {
    public C1143l(C1140i c1140i, AbstractC1135d abstractC1135d, int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(abstractC1135d.f7484a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f7497a = c1140i.m6797y(allocate, abstractC1135d.f7487d + (i10 * abstractC1135d.f7490g) + 28);
    }
}

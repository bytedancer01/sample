package p042cj;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: cj.m */
/* loaded from: combined.jar:classes3.jar:cj/m.class */
public class C1144m extends AbstractC1137f {
    public C1144m(C1140i c1140i, AbstractC1135d abstractC1135d, int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(abstractC1135d.f7484a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f7497a = c1140i.m6797y(allocate, abstractC1135d.f7487d + (i10 * abstractC1135d.f7490g) + 44);
    }
}
